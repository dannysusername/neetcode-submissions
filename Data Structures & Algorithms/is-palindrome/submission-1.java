class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length();

        for(int i = 0; i < s.length(); i++) {
            if(p1 == p2) {
                continue;
            }
            if(!(s.charAt(p1).equals(s.charAt(p2)))) {
                return false;
            }

            p1++;
            p2--;
        }

        return true;
    }
}
