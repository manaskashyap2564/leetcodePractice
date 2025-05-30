public class maximumSubarray {

}

// brute force (fails on TLE values)
    
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int msum = Integer.MIN_VALUE;
//         for(int i = 0; i<nums.length;i++){
//             for(int j = i; j<nums.length;j++){
//                 int sum = 0;
//                 for(int k = i;k<=j;k++){
//                     sum = sum + nums[k];
//                 }
//                 msum = Math.max(msum, sum);
//             }
//         }
//         return msum;
//     }
// }