class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // pair each car's position with its speed so they stay together when sorted
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // sort by position, closest to the target first (descending)
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        Deque<Double> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            double time = (double) (target - cars[i][0]) / cars[i][1];

            // new fleet only if this car is slower than the fleet ahead (top of stack)
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
            // else: it catches the fleet ahead and merges, so don't push
        }

        return stack.size();
    }
}
