///
/// Second Approach
/// 
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            
            if (map.containsKey(temp)) {
                return new int[] {map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}


///
/// First Approach
/// 
/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int index = 0; index < nums.length*nums.length; index++)
        {
            int i = index / nums.length;
            int j = index % nums.length;
            
            if(nums[i] + nums[j] == target && i != j)
            {
                return new int[] {i, j};
            }
        }
        return null;
    }
}
*/