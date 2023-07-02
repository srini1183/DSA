package com.srini.gfg.school;

/*


Given two positive integers A and B, find GCD of A and B.


Example 1:

Input: A = 3, B = 6
Output: 3
Explanation: GCD of 3 and 6 is 3

Example 2:

Input: A = 1, B = 1
Output: 1
Explanation: GCD of 1 and 1 is 1


Expected Time Complexity: O(log(min(A, B)))
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ A, B ≤ 109

*/
public class GcdOfTwoNumbers {
    public int gcd(int a, int b){
        if(a == 0 || b == 0) return Math.abs(a-b);
        else if(a>b) return gcd(a-b,b);
        else return gcd(a,b-a);
    }
    public static void main(String[] args) {
        GcdOfTwoNumbers obj = new GcdOfTwoNumbers();
        System.out.println(obj.gcd(5,10));
        System.out.println(obj.gcd(2,3));
    }
}
