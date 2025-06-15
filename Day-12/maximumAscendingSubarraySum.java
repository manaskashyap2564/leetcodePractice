public class maximumAscendingSubarraySum {
    
}
// class Solution {
//     public static int maxAscendingSum(int[] nums) {
//         int msum = 0; int tar = 0;
//         for(int i = 0;i<nums.length;i++){
//             int sum = 0;
//             if(i == 0){
//                 sum += nums[0];
//                 tar += sum;
//             }
//             else{
//                 if(nums[i]>nums[i-1]){
//                     sum = tar + nums[i];
//                     tar = sum;
//                 }
//                 else{
//                     tar = 0;
//                     sum = nums[i];
//                     tar = sum ;
//                 }
//             }
//             msum = Math.max(msum,sum);
//         }
//         return msum;
//     }
// }