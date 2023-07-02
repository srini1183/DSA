package com.srini.gfg.school;


/*

Given N,  reverse the digits of N.


Example 1:

Input: 200
Output: 2
Explanation: By reversing the digts of
number, number will change into 2.
Example 2:

Input : 122
Output: 221
Explanation: By reversing the digits of
number, number will change into 221.

Expected Time Complexity: O(Log(N))
Expected Space Complexity: O(1)


Constraints:
1 <= N <= 1015

*/

public class ReverseDigits {
    public long reverseDigits(long n){
        if(n<=10) return n;

        long ans = 0L;

        while(n>0){
            ans = ans * 10 + n % 10;
            n = n / 10;
        }

        return ans;
    }
    public static void main(String[] args) {
        ReverseDigits obj = new ReverseDigits();
        System.out.println(obj.reverseDigits(1000L));
        System.out.println(obj.reverseDigits(121L));
    }
}
