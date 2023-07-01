package com.srini.gfg.school;



/*
In a party of N people, each person is denoted by an integer. Couples are represented by the same number. Find out the only single person in the party of couples.


Example 1:

Input: N = 5
arr = {1, 2, 3, 2, 1}
Output: 3
Explaination: Only the number 3 is single.

Example 2:

Input: N = 11
arr = {1, 2, 3, 5, 3, 2, 1, 4, 5, 6, 6}
Output: 4
Explaination: 4 is the only single.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 104
1 ≤ arr[i] ≤ 106
*/
public class PartyOfCouples {
    public int findSingle(int arr[]){
        int ans = 0;
        for(Integer x:arr){
            ans = ans^x;
        }

        return ans;
    }

    public static void main(String[] args) {
        PartyOfCouples obj = new PartyOfCouples();
        System.out.println(obj.findSingle(new int[]{1,2,12,2,1}));
    }
}
