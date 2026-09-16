class Solution {
    public int minEatingSpeed(int[] piles, int maxHours) {
        int l = 1, h = 0;
        for (int pile : piles) h = Math.max(h, pile);

        while (l <= h) {
            int k = l + (h - l) / 2;
            long hours = 0;
            for (int pile : piles) hours += (pile + k - 1) / k;   // ceil

            if (hours > maxHours) l = k + 1;
            else h = k - 1;
        }
        return l;   // smallest speed that works
    }
}