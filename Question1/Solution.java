package Question1;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i]) {
                    return new int[] { j, i };
                }
            }
            nums[i] = target - nums[i];
        }

        return new int[] { 0, 0 };
    }
}