import java.util.Random;

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
         for (int j = 0; j<SIZE; j++) {
            colors[i][j] = random.nextInt(256);
         }
      }
   }

   public static void displayColors() {
      System.out.println("\u25CF Original matrix:");
      for (int i = 0; i < SIZE; i++) {
         for (int j = 0; j<SIZE; j++) {
            System.out.format("%4d", colors[i][j]);
         }
         System.out.println();
      }
   }

   public static void displayRotatedColors(){
      System.out.println("\u25CF Rotated matrix: ");
      for (int i = 0; i < SIZE; i++) {
         for (int j = 0; j<SIZE; j++) {
            System.out.format("%4d", rotatedColors[i][j]);
         }
         System.out.println();
      }
   }

   public static void rotateColors(){
      System.out.println("\u25CF Rotating...");
      for (int i = 0; i < SIZE; i++) {
         for (int j = 0; j<SIZE; j++) {
            rotatedColors[i][j] = colors[SIZE-j-1][i];
         }
      }
   }//end of methods section

} //end of Main
