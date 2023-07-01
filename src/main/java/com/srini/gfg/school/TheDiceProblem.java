package com.srini.gfg.school;

/*

You are given a cubic dice with 6 faces. All the individual faces have a number printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.

Example 1:

Input:
N = 6
Output:
1
Explanation:
For dice facing number 6 opposite face
will have the number 1.
Example 2:

Input:
N = 2
Output:
5
Explanation:
For dice facing number 5 opposite face
will have the number 2.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 6
* */

public class TheDiceProblem {

    public void getOppositeFace(int face){
        if(face<=0 || face>6){
            System.out.println("Invalid face");
            return;
        }

        System.out.println(Math.abs(face-7));
    }
    public static void main(String[] args) {
        TheDiceProblem obj = new TheDiceProblem();
        obj.getOppositeFace(1);
        obj.getOppositeFace(2);
        obj.getOppositeFace(3);
        obj.getOppositeFace(4);
        obj.getOppositeFace(5);
        obj.getOppositeFace(6);
    }
}
