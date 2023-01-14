class Solution {
    public boolean isSubsequence(String s, String t) {
        List<Character> tlist = new ArrayList<>();

        int[] a = new int[s.length()];

        int cnt = 0;
        int tmp = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = tmp; j < t.length(); j++) {
                if(s.charAt(i) == t.charAt(j)) {
                    tmp = j;
                    cnt++;
                    i++;
                    if (i >= s.length()) break;
                }
            }
            if (tmp == 5) break;
        }
        
        return cnt == s.length();
    }
}