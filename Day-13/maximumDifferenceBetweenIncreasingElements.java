public class maximumDifferenceBetweenIncreasingElements {
    
}
class Solution {
    public int maximumDifference(int[] nums) {
        int msum = -1, n = nums.length;
        if(n == 0 || n == 1) return -1;
        for(int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i] == nums[j]) continue;
                int sum = -1;
                sum = nums[j] - nums[i];
                msum = Math.max(msum,sum);
            }
        }
        return msum;
    }
}
