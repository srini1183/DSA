package com.srini.gfg.school;

/*
Given an integer, check whether it is a palindrome or not.

Example 1:

Input: n = 555
Output: Yes

Example 2:

Input: n = 123
Output: No

Expected Time Complexity: O(x)
Expected Space Complexity: O(x) where x is number of digits in n.


Constraints:
1 <= n <= 1000


 */
public class Palindrome {

    public String is_palindrome(int n)
    {
        int res = n;
        int reversed = 0;
        while(n>0){
            reversed = reversed*10+n%10;
            n/=10;
        }

        return reversed == res? "Yes":"No";
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.is_palindrome(555));
        System.out.println(obj.is_palindrome(123));
    }
}
