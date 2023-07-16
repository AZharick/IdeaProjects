//https://leetcode.com/explore/learn/card/the-leetcode-beginners-guide/692/challenge-problems/4422/
// [3,1,2,10,1] -> [3,4,6,16,17]

// [3,1,2,10,1] -> _ _ _ _ _

import java.util.Arrays;

public class SumOf1DArray {

   public static void main(String[] args) {
      int[] array = {3,1,2,10,1};
      System.out.println(Arrays.toString(sum(array)));
   }

   public static int[] sum(int[] array) {
      int[] answer = new int[array.length];
      answer[0] = array[0];   //3

      for (int i = 0; i < array.length-1; i++) {
         answer[i+1] = answer[i]+array[i+1];
      }
      return answer;
   }

   //еще лучше не создавать новый массив, а переписывать исходный
}
