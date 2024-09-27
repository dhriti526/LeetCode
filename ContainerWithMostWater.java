public class ContainerWithMostWater {
        public int maxArea(int[] nums) {
            int start = 0;
            int last = nums.length-1;
            int max = 0;
            while(start<last){
                // int h = Math.min(nums[start], nums[last]);
                int area = (last-start)* Math.min(nums[start], nums[last]);
                max = Math.max(max,area);
                if(nums[start]<nums[last])
                    start++;
                else
                    last--;
            }
            return max;
        }
    }
