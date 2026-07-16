class Solution {
    public int trap(int[] height) {
        
        int maxLeft = 0;
        int maxRight = 0;
        int[] maxLeftArr = new int[height.length];
        int[] maxRightArr = new int[height.length];
        int[] trappedRainWater = new int[height.length];

        /*
            Iterate through the amount of times there is spaces in the height array
            check if the height in the hoeght array is greater than the maxleft value. if so
            update maxleft and set that value in the index we are at height in the maxLeftArr
        */

        for(int i = 0; i < height.length; i++) {
            if(height[i] > maxLeft) {
                maxLeft = height[i];
                maxLeftArr[i] = maxLeft;
            } else {
                maxLeftArr[i] = maxLeft;
            }
        }

        /*
            Iterate the amount of times there is spaces in the height array until i is not >= 0
            If the height is greater than max height then update maxRight and set new value in maxRight Arr

            Else if the current value is the same as maxRight just add the maxRight value to maxRight arr
        */

        for(int i = height.length - 1; i >= 0; i--) {
            if(height[i] > maxRight) {
                maxRight = height[i];
                maxRightArr[i] = maxRight;
            } else  {
                maxRightArr[i] = maxRight;
            }
        }


        int trappedRainWaterSum = 0;
        for(int i = 0; i < height.length; i++) {
            trappedRainWater[i] = Math.min(maxLeftArr[i], maxRightArr[i]) - height[i];
            trappedRainWaterSum += trappedRainWater[i];
        }

        return trappedRainWaterSum;


    }
}
