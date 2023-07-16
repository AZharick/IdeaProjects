import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a digit:");
      int x;

      while (true) {
         try {
            String line = scanner.nextLine(); //благодаря String, считывается всегда без проблем
            x = Integer.parseInt(line);   //possible Exception here
            break;
         } catch (NumberFormatException ex1) {
            System.out.println("Нужно ввести число!");
         }
      }

      System.out.println("Вы ввели число "+x);

   }//end of psvm

}//end of Main