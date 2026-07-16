class Solution {
    public boolean isValid(String s) {
        
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '['|| c == '{') {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() != pairs.get(c)){
                return false;
            }
        }

        return stack.isEmpty();

    }
}
