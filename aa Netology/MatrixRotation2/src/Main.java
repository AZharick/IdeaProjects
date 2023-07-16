import java.util.Random;
import java.util.Scanner;

public class Main {

   public static final int SIZE = 8;
   static int[][] colors = new int[SIZE][SIZE];
   static int[][] rotatedColors = new int[SIZE][SIZE];

   public static void main(String[] args) {

      randomizeColors();
      displayColors();
      rotateColors();
      displayRotatedColors();

   } //end of psvm

   //METHODS SECTION
   public static void randomizeColors() {
      System.out.println("\u25CF Randomizing...");
      Random random = new Random();
      for (int i = 0; i < SIZE; i++) {
         for (int j = 0; j < SIZE; j++) {
            colors[i][j] = random.nextInt(256);
         }
      }
   }

   public static void displayColors() {
      System.out.println("\u25CF Original matrix:");
      for (int i = 0; i < SIZE; i++) {
         for (int j = 0; j < SIZE; j++) {
            System.out.format("%4d", colors[i][j]);
         }
         System.out.println();
      }
   }

   public static void displayRotatedColors() {
      System.out.println("\u25CF Rotated matrix: ");
      for (int i = 0; i < SIZE; i++) {
         for (int j = 0; j < SIZE; j++) {
            System.out.format("%4d", rotatedColors[i][j]);
         }
         System.out.println();
      }
   }

   public static void rotateColors() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter angle of rotation (90/180/270): ");
      int angle = scanner.nextInt();
      System.out.println("\u25CF Rotating to " + angle + "...");
      for (int i = 0; i < SIZE; i++) {
         for (int j = 0; j < SIZE; j++) {
            switch (angle) {
               case 90:
                  rotatedColors[i][j] = colors[SIZE - j - 1][i];
                  break;
               case 180:
                  rotatedColors[i][j] = colors[SIZE - i - 1][SIZE - j - 1];
                  break;
               case 270:
                  rotatedColors[j][i] = colors[i][SIZE - j - 1];
                  break;
            }
         }
      }
   }//end of methods section
} //end of Main