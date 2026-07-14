class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numsSet = new HashSet<Integer>();

        for(int num : nums) {
            numsSet.add(num);
        }

        int largestConsecutiveSequence = 0;

        for(int num : nums) {
            if(!numsSet.contains(num - 1)) {
                int count = 1;
                int current = num;
                while(numsSet.contains(current + 1)) {
                    count++;
                    current++;
                }

                largestConsecutiveSequence = Math.max(count, largestConsecutiveSequence);
            }

        }
        
        return largestConsecutiveSequence;
    }
}
