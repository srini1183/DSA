package com.srini.gfg.school;


/*

Given an array Arr of size N, print second largest distinct element from an array.

Example 1:

Input:
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the
array is 35 and the second largest element
is 34.
Example 2:

Input:
N = 3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of
the array is 10 and the second
largest element is 5.
Your Task:
You don't need to read input or print anything. Your task is to complete the function print2largest() which takes the array of integers arr and n as parameters and returns an integer denoting the answer. If 2nd largest element doesn't exist then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ N ≤ 105
1 ≤ Arri ≤ 105

*/

public class SecondLargestDistinctElement {
    public int print2largest(int arr[]) {
        int largest = -1;
        int secondLargest = -1;
        for(Integer num:arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            }else if(num>secondLargest && num!=largest){
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        SecondLargestDistinctElement obj = new SecondLargestDistinctElement();
        System.out.println(obj.print2largest(new int[]{1,2,2,3}));
        System.out.println(obj.print2largest(new int[]{1,1,1,1}));
    }

}
