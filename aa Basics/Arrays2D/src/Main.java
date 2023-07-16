import java.util.Arrays;
public class Main {

   static int [] arr1 = {1, 2, 3};
   static int [][] arr2 = {{1, 2, 3}, {4, 5, 6, 7}};

   //[1] [2] [3]
   static int [][][] arr3 = { {{1,2}, {3,4,5}, {6,7,8,9}} };

   static String [][] arrStr = {{"one", "two", "three"}, {"asd"}, {" asd"}};

   public static void main(String[] args) {
      System.out.println("Длина arr2 = " + arr2.length);           // 2
      System.out.println("Длина arr2[0] = " + arr2[0].length);     // 3
      System.out.println("Длина arr2[1] = " + arr2[1].length+ "\n");     // 4

      displayArr();
      clearArr();
      displayArr();
      setDigits();
      displayArr();

   } //end of psvm

   public static void displayArr() {
      System.out.print("Displaying arr2: ");
      for (int i = 0; i < arr2.length; i++) {
         for (int j = 0; j < arr2[i].length; j++) {
            System.out.print(arr2[i][j]);
         }
      }
      System.out.print("\n");
   }

   public static void setDigits() {
      System.out.println("Setting arr2...");
      int count = 1;
      for (int i = 0; i < arr2.length; i++) {
         for (int j = 0; j < arr2[i].length; j++) {
            arr2[i][j] = count;
            count++;
         }
      }
   }

   public static void clearArr(){
      System.out.println("Clearing arr2...");
      for (int i = 0; i < arr2.length; i++) {
         for (int j = 0; j < arr2[i].length; j++) {
            arr2[i][j] = 0;
         }
      }
   }

   public static void myArrToStringDisplay() {
      System.out.print("My display: ");
      for (int i = 0; i < arr2[i].length; i++) {
         System.out.println(Arrays.toString(arr2[i]));
      }
      System.out.print("\n");
   }

}
