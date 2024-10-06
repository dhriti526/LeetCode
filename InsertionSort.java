import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void sort(int[] nums) {
         for(int i=1;i<nums.length;i++){
             int j = i;
             while(j>0 && nums[j-1]>nums[j]){
                 int temp = nums[j-1];
                 nums[j-1]=nums[j];
                 nums[j]=temp;
                 j--;
             }
         }
    }
}
