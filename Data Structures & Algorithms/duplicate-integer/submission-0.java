class Solution {
    public boolean hasDuplicate(int[] nums) {
         for(int i = 0; i < nums.length; i++) {
            if(seen.containsKey(nums[i])) {
                return true;
            } else {
                seen.put(nums[i], i);
            }
        }
        return false;
    }
}