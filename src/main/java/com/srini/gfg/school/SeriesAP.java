package com.srini.gfg.school;

/*
Given the first 2 terms A1 and A2 of an Arithmetic Series.Find the Nth term of the series.

Example 1:

Input:
A1=2
A2=3
N=4
Output:
5
Explanation:
The series is 2,3,4,5,6....
Thus,4th term is 5.
Example 2:

Input:
A1=1
A2=2
N=10
Output:
10
Explanation:
The series is1,2,3,4,5,6,7,8,9,10,11..
Thus,10th term is 10.

Expected Time Complexity:O(1)
Expected Auxillary Space:O(1)


Constraints:
-104<=A1,A2<=104
1<=N<=103
*/
public class SeriesAP {

    public int nthTermOfAP(int a,int b, int n){
        return a+(n-1)*(b-a);
    }
    public static void main(String[] args) {
        SeriesAP obj = new SeriesAP();
        System.out.println(obj.nthTermOfAP(2,3,4));
    }
}
