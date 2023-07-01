package com.srini.gfg.school;


/*

Swap given two numbers and print them. (Try to do it without a temporary variable.) and return it.

Example 1:

Input: a = 13, b = 9
Output: 9 13
Explanation: after swapping it
becomes 9 and 13.
â€‹Example 2:

Input: a = 15, b = 8
Output: 8 15
Explanation: after swapping it
becomes 8 and 15.
Your Task:
You don't need to read input or print anything. Your task is to complete the function get() which takes a, b as inputs and returns the list of integers contains the new value of a and b after swap.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ a, b ≤ 106
*/
public class SwapTwoNumbers {

    int a;
    int b;
    public SwapTwoNumbers(int a,int b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return this.a+"|"+this.b;
    }

    public void swap(){
        this.a = this.a+this.b;
        this.b = this.a-this.b;
        this.a = this.a-this.b;
    }
    public static void main(String[] args) {
        SwapTwoNumbers obj = new SwapTwoNumbers(1,2);
        obj.swap();
        System.out.println(obj);

        obj = new SwapTwoNumbers(20,30);
        obj.swap();
        System.out.println(obj);
    }
}
