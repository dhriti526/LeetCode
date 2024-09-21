import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length ; i++){
            if(map.containsKey(target-nums[i]))
                return new int[]{i,map.get(target-nums[i])};

            map.put(nums[i] , i );

        }
        // nt[] n = [];

        // for(int i : map.values()){
        //     if(map.containsKey(target-nums[i])){
        //         return new int[]{i, map.get(target-nums[i])};
        //     }
        //     return new int[]{i,i};
        // }
        return new int[]{0,0};
    }

//    above solution is better than the below one
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for(int i = 0; i<nums.length; i++){
//            map.put(nums[i], i);
//        }
//        for(int i = 0; i<nums.length; i++){
//            int numTwo = target - nums[i];
//            if(map.containsKey(numTwo) && map.get(numTwo)!=i){
//                return new int[] {i, map.get(numTwo)};
//            }
//        }
//        return null;
//    }



}