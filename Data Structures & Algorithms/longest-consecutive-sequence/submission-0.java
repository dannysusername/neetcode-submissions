class Solution {
    public static int longestConsecutive(int[] nums) {
        /*
            Given an array of ints i have to return the length of the longest 
            conseutive sequence of elements that can be formed. 

            A consecutive sequence is a sequence of elements in which each element is exactly 1 
            greater than the previous element.
            
            Input: nums = {2, 20, 4, 10, 3, 4, 5}
            output: 4

            Since the numbers 2,3,4,5 are the longest consecutive sequence of elements then the out
            put is the length of that amount of numbers

            Input: nums = [0,3,2,5,4,6,1,1]
            Output: 7

            Since 0,1,2,3,4,5,6 are a consecutive sequence of elements then the output is 7
            ---------
            To solve this i already have some ideas. One idea is to create an 
            array and place each number at an index the same as the number. FOr example
            number 7 goes to index 7, number 8 goes to index 8. Then iterate through
            that array and find the longest consecutive sequence. This would not work
            for negative numbers

            2. Sort then find longest consec sequence O(n log n)
            3. Maybe I can use a hashmap where the key is the number and they value is a list 
            just in case there are multiple numbers. So i can iterate through the given array
            find the smallest and largest numbers, put them in a hashmap, then iterate through the hashmap
            (does not work this doesnt account for the numbers not being in order and if there is multiple of
            the same numbers then its not consecutive)

            4. Go through the array 

        */

        int n = nums.length;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        //if map contains the number we are looking at then add number to list else just create new list
        for(int i = 0; i < n; i++) {
            if(nums[i] < smallest) {
                smallest = nums[i];
            }
            if(nums[i] > largest) {
                largest = nums[i];
            }

        }

        int[] helperArray = new int[largest + 1];

        for(int i = 0; i < n; i++) {

            // 2, 20, 4, 10, 3, 4, 5
            helperArray[nums[i]]++;

        }

        int count = 0;
        int largestCount = 0;
        for(int i = smallest; i <= largest; i++) {
            if(helperArray[i] > 0) {
                count++;
            } else {
                count = 0;
                continue;
            }

            if(count > largestCount) {
                largestCount = count;
            }


        }

        return largestCount;
}
