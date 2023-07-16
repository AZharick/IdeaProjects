import java.util.Arrays;

public class MinMaxAvrg {

   public static void main(String[] args) {
      int[] array = createIntArray();
      System.out.println(Arrays.toString(array));
      System.out.println("min = " + getMin(array));
      System.out.println("max = " + getMax(array));
      System.out.println("avrg = " + getAverage(array));
   }

   public static int[] createIntArray () {
      int arrayLength = (int) (Math.random()*100)%20+5;
      int[] array = new int[arrayLength];
      for (int i = 0; i < arrayLength; i++) {
         array[i] = (int) Math.round(Math.random()*100);
      }
      return array;
   }

   public static int getMin(int[] array) {
      int min = array[0];
      for (int i = 1; i < array.length; i++) {
         if (array[i]<min) {
            min = array[i];
         }
      }
      return min;
   }

   public static int getMax(int[] array) {
      int max = array[0];
      for (int i = 1; i < array.length; i++) {
         if (array[i]>max) {
            max = array[i];
         }
      }
      return max;
   }

   public static int getAverage(int[] array) {
      int sum=0;
      for (int i:array) {
         sum+=i;
      }
      return sum/array.length;
   }

}
