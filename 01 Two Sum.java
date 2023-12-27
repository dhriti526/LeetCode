class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i<nums.length; i++){
            int numTwo = target - nums[i];
            if(map.containsKey(numTwo) && map.get(numTwo)!=i){
                return new int[] {i, map.get(numTwo)};
            }
        }
        return null;
    }
}