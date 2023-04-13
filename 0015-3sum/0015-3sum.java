class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();

        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-2; i++) {
            int s = i+1;
            int e = nums.length-1;
            while(s < e){
                int sum = nums[i] + nums[s] + nums[e];
                if(sum == 0) {
                    List<Integer> ilist = new ArrayList<>();
                    ilist.add(nums[i]);
                    ilist.add(nums[s]);
                    ilist.add(nums[e]);
            
                    ans.add(ilist);
                    s++;
                }
                else if(sum < 0) {
                    s++;
                }
                else {
                    e--;
                }
            }
        }
        
        return new ArrayList<>(ans);
    }
}