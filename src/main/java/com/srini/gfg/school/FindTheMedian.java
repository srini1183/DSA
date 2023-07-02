package com.srini.gfg.school;

import java.util.Arrays;

/*
Given an array arr[] of N integers, calculate the median


Example 1:

Input: N = 5
arr[] = 90 100 78 89 67
Output: 89
Explanation: After sorting the array
middle element is the median

Example 2:

Input: N = 4
arr[] = 56 67 30 79
Output: 61
Explanation: In case of even number of
elements, average of two middle elements
is the median.



Your Task:
You don't need to read or print anything. Your task is to complete the function find_median() which takes the array as input parameter and returns the floor value of the median.


Expected Time Complexity: O(n * log(n))
Expected Space Complexity: O(1)


Constraints:
1 <= Length of Array <= 100
1 <= Elements of Array <= 100
*/
public class FindTheMedian {

    public int getMedian(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        return len%2 == 0? (arr[len/2]+arr[len/2-1])/2: arr[len/2];
    }

    public static void main(String[] args) {
        FindTheMedian obj = new FindTheMedian();
        System.out.println(obj.getMedian(new int[]{90,100,78,89,67}));
        System.out.println(obj.getMedian(new int[]{56,67,30,79}));
    }
}
