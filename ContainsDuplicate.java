import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(uniqueNums.contains(nums[i]))
                return Boolean.TRUE;
            uniqueNums.add(nums[i]);
            // System.out.println(nums[i]);
        }
        // System.out.println(uniqueNums);
        // if(uniqueNums.size()==nums.length)
        return Boolean.FALSE;
        // return Boolean.TRUE;


    }
}