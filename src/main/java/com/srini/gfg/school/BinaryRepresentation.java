package com.srini.gfg.school;

import org.apache.commons.lang3.StringUtils;
/*

Write a program to print Binary representation of a given number N.

Example 1:

Input:
N = 2
Output:
000000000000000000000000000010
Explanation:
The binary representation of 2 is '10'
but we need to print in 30 bits so append
remaining 0's in the left.
Example 2:

Input:
N = 5
Output:
000000000000000000000000000101
Explanation:
The binary representation of 5 is '101'.

Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 10^9
*/
public class BinaryRepresentation {

    String getBinary(int N){
        StringBuffer ans = new StringBuffer();
        while(N>0){
            ans.append(N%2);
            N/=2;
        }

        return StringUtils.leftPad(ans.reverse().toString(),30,"0");
    }

    public static void main(String[] args) {
        BinaryRepresentation obj = new BinaryRepresentation();
        System.out.println(obj.getBinary(5));
    }
}
