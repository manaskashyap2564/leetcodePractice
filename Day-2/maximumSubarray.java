public class maximumSubarray {

}
    
// class Solution {
    // M1 -->> Brute Force (fails on TLE values)
    // public static int maxSum(int[] nums) {
    //     int msum = Integer.MIN_VALUE;
    //     for(int i = 0; i<nums.length;i++){
    //         for(int j = i; j<nums.length;j++){
    //             int csum = 0;
    //             for(int k = i;k<=j;k++){
    //                 csum = csum + nums[k];
    //             }
    //             msum = Math.max(msum, csum);
    //         }
    //     }
    //     return msum;
    // }
    // 
    // // M2 -->> Prefix Sum
    // public static int maxPSum(int[] nums) {
    //     int msum = Integer.MIN_VALUE;
    //     int parr[] = new int[nums.length];
    //     parr[0] = nums[0];
    //     for (int i = 1; i < parr.length; i++) {
    //         parr[i] = nums[i] + parr[i-1];
    //     }
    //     for(int i = 0; i<nums.length;i++){
    //         for(int j = i; j<nums.length;j++){
    //             int csum = 0 ;
    //             csum = i == 0 ? parr[j] :  parr[j] - parr[i-1];
    //             msum = Math.max(msum, csum);
    //         }
    //     }
    //     return msum;
    // }
    // 
    // // M1 -->> Kadane's Algorithm 
    // public static int kadane(int nums[]){
    //     int msum = nums[0];
    //     int csum = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         csum = csum + nums[i];
    //         msum = Math.max(msum, csum);
    //         if (csum < 0)  csum = 0;
    //     }
    //     return msum;
    // }
// }