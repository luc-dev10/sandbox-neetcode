/**
 * https://neetcode.io/problems/duplicate-integer/
 * 
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 * 
 * Constraints:
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }

        return false;
    }
}