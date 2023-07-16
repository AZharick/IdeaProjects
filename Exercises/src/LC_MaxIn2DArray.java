/* https://leetcode.com/explore/learn/card/the-leetcode-beginners-guide/692/challenge-problems/4423/

   You are given an MxN integer grid accounts where accounts[i][j] is the amount of
   money the i-th customer has in the j-th bank. Return the wealth that the richest customer has.
   A customer's wealth is the amount of money they have in all their bank accounts.
*/

import java.util.Arrays;

public class LC_MaxIn2DArray {
   static int[][] accounts = {
           {7,1,3,4},
           {2,8,7,2},
           {1,9,5,6}
   };

   public static void main(String[] args) {
      System.out.println("Maximum wealth is: " + getMaxWealth(accounts));
   }

   public static int getMaxWealth(int[][] accounts) {
      int[] wealth = new int[accounts.length];

      for (int i = 0; i < accounts.length; i++) {
         for (int j = 0; j < accounts[i].length; j++) {
            wealth[i] += accounts[i][j];
         }
      }

      int max = wealth[0];
      for (int i = 1; i < wealth.length; i++) {
         if (wealth[i]>max) {
            max = wealth[i];
         }
      }
      return max;
   }

}
