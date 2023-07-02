package com.srini.gfg.school;

import java.util.ArrayList;

/*
Given a string S of length N, find the pattern of the strings as shown below in the examples.

Example 1:

Input: S = "GeeK"
Output: Geek
        Gee
        Ge
        G
Explanation: Decrease one character
after each line
â€‹Example 2:

Input: S = "G*g"
Output: G*g
        G*
        G
Explanation: Decrease one character
after each line

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(N2)

Constraints:
1 ≤ N ≤ 103
*/
public class PatternOfString {

    ArrayList<String> getPattern(String S) {
        ArrayList<String> ans = new ArrayList<>();
        int len = S.length();
        while(len>0){
            ans.add(S.substring(0,len));
            len = len-1;
        }

        return ans;
    }
    public static void main(String[] args) {
        PatternOfString obj = new PatternOfString();
        for(String x:obj.getPattern("Geeks")){
            System.out.println(x);
        }
    }
}
