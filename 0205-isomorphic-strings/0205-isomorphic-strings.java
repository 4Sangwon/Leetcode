class Solution {
    public boolean isIsomorphic(String s, String t) {
        List<Character> slist = new ArrayList<>();
        List<Character> tlist = new ArrayList<>();
        
        int[] a = new int[s.length()];
        int[] b = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (!slist.contains(s.charAt(i))) {
                slist.add(s.charAt(i));
            }
            if (!tlist.contains(t.charAt(i))) {
                tlist.add(t.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            a[i] = slist.indexOf(s.charAt(i));
            b[i] = tlist.indexOf(t.charAt(i));
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        
        return true;
    }
}