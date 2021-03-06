
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == diff) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

public int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}