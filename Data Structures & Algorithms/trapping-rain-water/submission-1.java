class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int totalTrappedWater = 0;

        while(left < right) {
            if(height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                totalTrappedWater += leftMax - height[left];
                left++;

            } else {
                rightMax = Math.max(rightMax, height[right]);
                totalTrappedWater += rightMax - height[right];
                right--;
            }
        }

        return totalTrappedWater;
    }
}
