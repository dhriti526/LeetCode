import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.Bubblesorting(arr);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void Bubblesorting(int[] nums){
         for(int i = nums.length-1;i>=0;i--){
             int swap = 0;
             for(int j=0;j<=i-1;j++){
                 if(nums[j]>nums[j+1]){
                     int temp = nums[j];
                     nums[j]=nums[j+1];
                     nums[j+1]=temp;
                     swap= 1;
                 }
             }
             if(swap==0){
                     break;
                 }
         }
    }
}
