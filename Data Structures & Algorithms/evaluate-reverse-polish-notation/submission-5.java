class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        int total = 0;
        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+")) {
                int value2 = stack.pop();
                int value1 = stack.pop();
                total = value1 + value2;
                stack.push(total);
            } else if (tokens[i].equals("-")) {
                int value2 = stack.pop();
                int value1 = stack.pop();
                total = value1 - value2;
                stack.push(total);
            } else if (tokens[i].equals("*")) {
                int value2 = stack.pop();
                int value1 = stack.pop();
                total = value1 * value2;
                stack.push(total);
            } else if (tokens[i].equals("/")){
                int value2 = stack.pop();
                int value1 = stack.pop();
                total = value1 / value2;
                stack.push(total);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }

        }

        return stack.pop();
    }
}
