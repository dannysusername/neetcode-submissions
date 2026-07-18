class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            if(i == 0) {
                stack.push(i);
                continue;
            }
            
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);

        }

        return result;
    }
}
