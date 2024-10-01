public class FindMinimumInRotatedSortedArray {
        public int findMin(int[] nums) {
            int start = 0;
            int end= nums.length-1;
            //   int r = 0
            while(start<end){
                int mid = (start+end)/2;
                if(nums[mid]>nums[end])
                    // r = mid;
                    start = mid+1;
                if(nums[mid]<nums[end]){
                    end = mid;
                }
            }
            return nums[start];

        }
    }