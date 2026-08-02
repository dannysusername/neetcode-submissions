class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int largestPile = 0;

        for(int pile : piles) {
            largestPile = Math.max(largestPile, pile);
        }

        int lo = 0;
        int hi = largestPile;
        int mid = 0;
        int minimumRate = Integer.MAX_VALUE;

        while(lo <= hi) { //O(log n)
            mid = lo + (hi - lo) / 2;
            int total = 0; //total hours it took to eating all babanas
            for(int pile : piles) {//O(n)
                total += Math.ceil((double)pile / mid);
            }
            if(total > h) {
                lo = mid + 1;
            } else {
                if(mid < minimumRate) {
                    minimumRate = mid;
                }
                hi = mid - 1;
            }
            
        }
        
        return minimumRate;
    }

    
}
