class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);

        }

        for(int i = 0; i < t.length(); i++) {
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(int values : count.values()) {
            if(values != 0) {
                return false;
            }
        }

        return true;

    }
}
