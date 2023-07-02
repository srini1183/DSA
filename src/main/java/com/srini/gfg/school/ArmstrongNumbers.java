package com.srini.gfg.school;


/*

For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371

Example 1:

Input: N = 153
Output: "Yes"
Explanation: 153 is an Armstrong number
since 13 + 53 + 33 = 153.
Hence answer is "Yes".
Example 2:

Input: N = 370
Output: "Yes"
Explanation: 370 is an Armstrong number
since 33 + 73 + 03 = 370.
Hence answer is "Yes".

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
100 ≤ n <1000

*/
public class ArmstrongNumbers {

    String isArmstrongNumber(int n){
        int sumOfCubedDigits = 0;
        int res = n;
        while(n>0){
            int val = n%10;
            n/=10;
            sumOfCubedDigits+= (val*val*val);
        }

        return res == sumOfCubedDigits? "Yes":"No";
    }

    public static void main(String[] args) {
        ArmstrongNumbers obj = new ArmstrongNumbers();
        System.out.println(obj.isArmstrongNumber(153));
        System.out.println(obj.isArmstrongNumber(100));
    }
}
