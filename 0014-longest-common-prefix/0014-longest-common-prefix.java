class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        
        for(int i = 1; i < strs.length; i++){
            if(strs[i].indexOf(s) != 0){
                s = s.substring(0, s.length() - 1);
                i = 0;
            }
        }
        
        
        return s;
    }
}