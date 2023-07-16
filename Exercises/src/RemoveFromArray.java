import java.util.Arrays;

public class RemoveFromArray {

   public static void main(String[] args) {
      int[] arrayToProcess = {1, 66, 2, 3, 4, 66, 5, 6, 7, 66, 8, 9}; //length 12
      System.out.println(Arrays.toString(removeNumberFromArray(arrayToProcess, 66)));

   }

   public static int[] removeNumberFromArray(int[] array, int number) {
      int numberCount = 0;
      for (int i : array) {
         if (i == number) {
            numberCount++;
         }
      }
      int[] newArray = new int[array.length - numberCount];
      int newArrayIndex = 0;

      for (int i:array) {
         if (i != number) {
            newArray[newArrayIndex] = i;
            newArrayIndex++;
         }
      }
      return newArray;
   }

}
