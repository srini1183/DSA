package com.srini.gfg.school;


/*

Given an sorted array A of size N. Find number of elements which are less than or equal to given element X.

Example 1:

Input:
N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9
Output:
5


Example 2:

Input:
N = 7
A[] = {1, 2, 2, 2, 5, 7, 9}
X = 2
Output:
4


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)



Constraints:
1 <= N <= 105
1 <= Ai <= 105
0 <= X <= 105
*/
public class CountOfSmallerElements {

    public long getSmallerElemetsCount(long arr[],long x){
        long ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<=x){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return ans == -1?0:ans+1;
    }

    public static void main(String[] args) {
        CountOfSmallerElements obj = new CountOfSmallerElements();
        System.out.println(obj.getSmallerElemetsCount(new long[]{1000,2000,3000,4000},1001));
    }
}
