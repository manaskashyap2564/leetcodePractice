public class trappingRainWater {
    
}
class Solution {
    public int trap(int[] height) {
        int wt = 0, n = height.length;
        int lmb[] = new int[n];
        int rmb[] = new int[n];

        lmb[0] = height[0];
        for (int i = 1; i < n; i++) {
            lmb[i] = Math.max(lmb[i-1],height[i]);
        }

        rmb[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rmb[i] = Math.max(height[i], rmb[i+1]);
        }

        for (int i = 0; i < n; i++) {
            int wtb = 0;
            wtb = Math.min(lmb[i], rmb[i]) - height[i];
            wt += wtb ;
        }
        return wt;
    }
}