class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = String.valueOf(nums[i]).length() % 2 == 0 ? res + 1 : res;
        }

        return res;
    }
}