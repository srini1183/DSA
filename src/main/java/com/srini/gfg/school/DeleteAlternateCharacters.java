package com.srini.gfg.school;

/*
Given a string S as input. Delete the characters at odd indices of the string.

Example 1:

Input: S = "Geeks"
Output: "Ges"
Explanation: Deleted "e" at index 1
and "k" at index 3.
Example 2:

Input: S = "GeeksforGeeks"
Output: "GesoGes"
Explanation: Deleted e, k, f, r, e
k at index 1, 3, 5, 7, 9, 11.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)

Constraints:
1<= |S| <=1000
*/
public class DeleteAlternateCharacters {
    String delete(String S) {
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<S.length();i+=2) ans.append(S.charAt(i));
        return ans.toString();
    }

    public static void main(String[] args) {
        DeleteAlternateCharacters obj = new DeleteAlternateCharacters();
        System.out.println(obj.delete("GeeksForGeeks"));
    }
}
