package com.srini.gfg.school;

/*
Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.

Example 1:

Input:
N=56
Output:
1
Explanation:
The digit sum of 56 is 5+6=11.
Since, 11 is a palindrome number.Thus,
answer is 1.
Example 2:

Input:
N=98
Output:
0
Explanation:
The digit sum of 98 is 9+8=17.
Since 17 is not a palindrome,thus, answer
is 0.


Expected Time Complexity:O(LogN)
Expected Auxillary Space:O(1)

Constraints:
1<=N<=109

*/
public class SumOfDigitsIsPalindromeOrNot {
    public boolean isPalindrome(int n){
        int res = n;
        int reversed = 0;

        while(n>0){
            reversed = reversed*10+n%10;
            n/=10;
        }


        return reversed == res;
    }

    public int getSumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }

        return sum;
    }

    int isDigitSumPalindrome(int N) {
        return isPalindrome(getSumOfDigits(N))?1:0;
    }

    public static void main(String[] args) {
        SumOfDigitsIsPalindromeOrNot obj = new SumOfDigitsIsPalindromeOrNot();
        System.out.println(obj.isDigitSumPalindrome(56));
        System.out.println(obj.isDigitSumPalindrome(98));
    }
}
