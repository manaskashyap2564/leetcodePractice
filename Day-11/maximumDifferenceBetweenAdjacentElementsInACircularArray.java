public class maximumDifferenceBetweenAdjacentElementsInACircularArray {
    
}
// class Solution {
//     public int maxAdjacentDistance(int[] nums) {
//         int md = Integer.MIN_VALUE;
//         for(int i = 0;i<nums.length;i++){
//             int d = 0;
//             if(i == nums.length - 1){
//                 d = Math.abs(nums[i]-nums[0]);
//             }
//             else{
//                 d = Math.abs(nums[i]-nums[i+1]);
//             }
//             if(d>md) md = d;
//         }
//         return md;
//     }
// }