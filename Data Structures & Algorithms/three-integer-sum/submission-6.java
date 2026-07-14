class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        Arrays.sort(nums);
        List<List<Integer>> threeSums = new List<List<Integer>>();

        for(int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            
            while(j < k) {
                if(nums[i] == nums[j] || nums[j] == nums[k]) {
                    continue;
                }

                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0) {
                    List<Integer> newSum = new ArrayList<Integer>;
                    newSum.add(nums[i], nums[j], nums[k])
                    threeSums.add(newSum);
                    p1++;
                    p2--;
                } else if (sum < 0) {
                    p1++;
                } else {
                    p2--;
                }

            }

        }
        
    }
}
