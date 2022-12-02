class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, max = 0, last = nums[0];
        if(nums[0] == 1){
            cnt = 1;
            max = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if(last == nums[i] && last == 1){
                cnt++;
                if(cnt > max)
                    max = cnt;
            } else if (last != nums[i] && nums[i] == 1) {
                last = nums[i];
                cnt = 1;
                if(cnt > max)
                    max = cnt;
            } else {
                last = nums[i];
                cnt = 0;
            }
        }
        return max;
    }
}