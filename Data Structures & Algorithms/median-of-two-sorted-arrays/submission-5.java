class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int total = n + m;
        int half = (total + 1) / 2;
        
        int lo = 0;
        int hi = nums1.length;

        while(lo <= hi) {
            int mid1 = lo + (hi - lo) / 2;
            int mid2 = (half - mid1);

            int left1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int right1 = (mid1 == m) ? Integer.MAX_VALUE : nums1[mid1];
            int left2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int right2 = (mid2 == n) ? Integer.MAX_VALUE : nums2[mid2];

            if(left1 <= right2 && left2 <= right1) {
                if(total % 2 == 1) {
                    return Math.max(left1, left2);
                }
                return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
            } else if (left1 > right2) {
                hi = mid1 - 1;
            } else {
                lo = mid1 + 1;
            }
        }
        throw new IllegalArgumentException("input arrays are not sorted");
    }

}
