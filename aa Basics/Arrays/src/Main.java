import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
   static String[][] array2DStr = new String[6][8];
   static int[][] array2D = new int[5][8];
   static int[] array1D = new int[20];

   //=================================================
   public static void main(String[] args) {

      int[] test = new int[1];
      test[0] = 666;
      test = new int[5]; //пересоздание, обнуление всех эл-тов
      test[4] = 5;
      System.out.println("0 = " + test[0]); //0
      System.out.println("4 = " + test[4]); //5

      //================================================
      System.out.println("array2D length (кол-во строк) = "+array2D.length);  //5
      System.out.println("array2D[0] length (кол-во столбцов)= "+array2D[0].length);  //8
      System.out.println();
      System.out.println();

      fill1DIntArray(array1D);
      display1DIntArray(array1D);
      System.out.println(Arrays.toString(sortBySelecting1DIntArray(array1D)));


   }//================================================
   private static void fill1DIntArray(int[] matrix) {
      System.out.println("\u25CF Filling 1D int array...");
      for (int i = 0; i < matrix.length; i++) {
         Random random = new Random();
         matrix[i] = random.nextInt(70);
      }
   }
   private static void fill2DIntArray(int[][] matrix) {
      System.out.println("\u25CF Filling int array...");
      Random random = new Random();
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = random.nextInt(1000);
         }
      }
   }
   private static void fill2DLatinStringArray(String[][] matrix) {
      System.out.println("\u25CF Generating 2D String array...");
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = generateLatinString(8);
         }
      }
   }
   private static void fill2DCyrillicStringArray(String[][] matrix) {
      System.out.println("\u25CF Generating 2D String array...");
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = generateCyrillicString(8);
         }
      }
   }

   private static void display1DIntArray(int[] matrix) {
      System.out.println("\u25CF Displaying 1D int array...\n");
      for (int i = 0; i < matrix.length; i++) {
         System.out.print(matrix[i]+" ");
      }
      System.out.println();
   }
   private static void display2DIntArray(int[][] matrix) {
      System.out.println("\u25CF Displaying 2D array...\n");
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            System.out.printf("%4d", matrix[i][j]);
         }
         System.out.println();
      }
      System.out.println();
   }
   private static void display2DStringArray(String[][] matrix) {
      System.out.println("\u25CF Displaying 2D String array...\n");
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j]+" ");
         }
         System.out.println(" ");
      }
      System.out.println();
   }

   private static String generateLatinString (int wordMaxLength) {
      int min = 97;
      int max = 122;
      int diff = max - min;
      Random randWordLength = new Random();
      int currentWordLength = randWordLength.nextInt(wordMaxLength);
      char[] chArray = new char[currentWordLength];
      for (int i = 0; i < currentWordLength; i++) {
         Random randChar = new Random();
         chArray[i] = (char) (randChar.nextInt(diff) + min);
      }
      String word = String.valueOf(chArray);
      return word;
   }
   private static String generateCyrillicString (int wordMaxLength) {
      int min = 1072;
      int max = 1103;
      int diff = max - min;
      Random randWordLength = new Random();
      int currentWordLength = randWordLength.nextInt(wordMaxLength);
      char[] chArray = new char[currentWordLength];
      for (int i = 0; i < currentWordLength; i++) {
         Random randChar = new Random();
         chArray[i] = (char) (randChar.nextInt(diff) + min);
      }
      String word = String.valueOf(chArray);
      return word;
   }

   private static void findExtremes(int[][] matrix) {
      System.out.println("\u25CF Searching for extreme values...");
      int currentMaxInt = matrix[0][0];
      int currentMinInt = matrix[0][0];
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j]>currentMaxInt) {
               currentMaxInt = matrix[i][j];
            }
            if (matrix[i][j]<currentMinInt) {
               currentMinInt = matrix[i][j];
            }
         }
      }
      System.out.println("Max Value = "+currentMaxInt);
      System.out.println("Min Value = "+currentMinInt);
   }
   private static int[] reverse1DIntArray(int[] matrix) {
      int[] output = new int[matrix.length];
      int outputCellNo = matrix.length;
      for (int i = 0; i < matrix.length; i++) {
         output[outputCellNo-1] = matrix[i];
         outputCellNo--;
      }
      return output;
   }

   private static int[] transform2DTo1D(int[][] matrix) {
      System.out.println("\u25CF Transforming 2D into 1D...");
      int[] arr = new int[matrix.length * matrix[0].length];
      int currentArrCellNumber = 0;

      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            arr[currentArrCellNumber] = matrix[i][j];
            currentArrCellNumber++;
         }
      }
        return arr;
   }
   private static int[][] transform1DTo2D(int[] input, int[][] output) {
      if ((output.length * output[0].length) != input.length) {
         System.out.println("*** ERROR: Incompatible arrays' lengths! ***");
         return null;
      }
      int count = 0;
      for (int i = 0; i < output.length; i++) {
         for (int j = 0; j < output[i].length; j++) {
            if (count<input.length) {
            output[i][j] = input[count];
            count++;
            }
         }
      }
      return output;
   }

   private static int[] sort1DIntArray(int[] matrix) {
      System.out.println("\u25CF Sorting 1D int array...\n");
      int[] sortedMatrix = new int[matrix.length];
      sortedMatrix = matrix;
      Arrays.sort(sortedMatrix);
      return sortedMatrix;
   }
   private static void sortInt2DArray(int[][] input) {
      System.out.println("\u25CF Sorting...");
      int[] arr = sort1DIntArray(transform2DTo1D(input));
      int[][] arr2 = new int[5][8];
      display2DIntArray(transform1DTo2D(arr, arr2));
   }
   private static int[] sortBubble1DIntArray(int[] matrix) {
      for (int i = 0; i < matrix.length - 1; i++) {
         for (int j = matrix.length - 1; j > i; j--) {
            if (matrix[j - 1] > matrix[j]) {
               int tmp = matrix[j - 1];
               matrix[j - 1] = matrix[j];
               matrix[j] = tmp;
            }
         }
      }
      return matrix;

   }
   private static int[] sortBySelecting1DIntArray(int[] matrix) {
      int[] sorted = new int[matrix.length];
      sorted[0] = matrix[0];
      int pos = 0;
      for (int i = 0; i < matrix.length; i++) {
         if (matrix[i]<matrix[pos]) {
            sorted[pos] = matrix[i];
         }
         pos++;
      }
      return sorted;
   }


} //end of Main