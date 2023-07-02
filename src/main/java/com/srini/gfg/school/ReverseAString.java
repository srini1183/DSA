package com.srini.gfg.school;

/*Given a String S , print the reverse of the string as output.

Example 1:

Input: S = "GeeksforGeeks"
Output: "skeeGrofskeeG"
Explanation: Element at first is at last and
last is at first, second is at second last and
second last is at second position and so on .
Example 2:

Input: S = "ReversE"
Output: "EsreveR"
Explanation: "E" at first and "R" at last and
"e" at second last and "s" at second and
so on .

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)

Constraints:
1<= |S| <=1000
*/

public class ReverseAString {

    static String reverse(String S) {

        return new StringBuffer(S).reverse().toString();
        /*
        char[] arr = S.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }

        return new String(arr);*/
    }

    public static void main(String[] args) {
        ReverseAString obj = new ReverseAString();
        System.out.println(obj.reverse("abcd"));
    }
}
