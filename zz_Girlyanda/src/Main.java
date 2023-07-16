import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Main {
   //- метод blink, который будет мигать лампочками гирлянды один раз (операция ~);
   //- метод run, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
   //- метод isFirstLampOn, который будет выяснять включена ли лампочка в первой позиции (наложение маски с помощью &);
   //- метод, который будет распечатывать текущее состояние гирлянды. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
   //Используйте побитовые операции.

   static boolean[] lights = new boolean[32];

   public static void main(String[] args) throws InterruptedException {
      randomizeLights(lights);
      displayLights(lights);
      blink(lights, 5);

   }//end of psvm

   public static void randomizeLights(boolean[] matrix) {
      for (int i = 0; i < matrix.length; i++) {
         Random random = new Random();
         matrix[i] = random.nextBoolean();
      }
   }

   public static int[] boolToInt(boolean[] matrix) {
      int[] lightsInt = new int[lights.length];
      for (int i = 0; i < matrix.length; i++) {
         if (matrix[i] == true) {
            lightsInt[i] = 1;
         } else {
            lightsInt[i] = 0;
         }
      }
      return lightsInt;
   }

   public static void displayLights(boolean[] matrix) {
      for (int i = 0; i < matrix.length-1; i++) {
         if(matrix[i] == true) {
            System.out.print("1-");
         } else {
            System.out.print("0-");
         }
      }

      if (matrix[matrix.length-1] == true) {
         System.out.println("1");
      } else {
         System.out.println("0");
      }
   }

   public static void blink(boolean[] matrix, int times) throws InterruptedException {
      boolean[] inverted = new boolean[matrix.length];
      for (int i = 0; i < matrix.length; i++) {
         inverted[i] = !matrix[i];
      }

      for (int i = 0; i <= times; i++) {
         displayLights(inverted);
         Thread.sleep(500);
         displayLights(matrix);
         Thread.sleep(500);
      }
   }




















}//end of Main
