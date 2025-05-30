public class divisibleAndNonDivisibleSumsDifference {
    
}
// approach 1 (by self)

// class Solution {
//     int num1,num2;
//     public int divByM(int n,int m){
//         for(int i = 1;i<=n;i++){
//             if(i%m!=0) num1+=i;
//         }
//         return num1;
//     }
//     public int notDivByM(int n,int m){
//         for(int i = 1;i<=n;i++){
//             if(i%m==0) num2+=i;
//         }
//         return num2;
//     }
//     public int differenceOfSums(int n, int m) {
//         return divByM(n,m) - notDivByM(n,m); 
//     }
// }


// approach 2 & 3 -- (suggested by leeetcode and others)

// class Solution {
//     public int differenceOfSums(int n, int m) {
//         int ans = 0;
//         for (int i = 1; i <= n; i++) {
//             if (i % m == 0) {
//                 ans -= i;
//             } else {
//                 ans += i;
//             }
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int differenceOfSums(int n, int m) {
//         int k = n / m;
//         return (n * (n + 1)) / 2 - k * (k + 1) * m;
//     }
// }

