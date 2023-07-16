// демонстрация косяков при чередовании nextLine() и других next'ов
// и решение

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      //1-й блок: негодный, с проскоком ==================
      System.out.print("\nEnter a digit: ");
      int a = scanner.nextInt();
      System.out.println("\nEnter a word: ");
      String b = scanner.nextLine();
      System.out.println("\nEnter a word: ");
      String c = scanner.nextLine();

      System.out.println("a = "+a);
      System.out.println("b = "+b);
      System.out.println("c = "+c);

      //2-й блок: годный ===============================
      System.out.print("\nEnter a digit: ");
      int a1 = Integer.parseInt(scanner.nextLine());
      System.out.println("\nEnter a word: ");
      String b1 = scanner.nextLine();
      System.out.println("\nEnter a word: ");
      String c1 = scanner.nextLine();

      System.out.println("a1 = "+a1);
      System.out.println("b1 = "+b1);
      System.out.println("c1 = "+c1);

      //3-й блок: условно годный =========================
      System.out.print("\nEnter a digit: ");
      int a2 = scanner.nextInt();
      System.out.println("\nEnter a word: ");
      scanner.nextLine();     //перехват переноса строки
      String b2 = scanner.nextLine();
      System.out.println("\nEnter a word: ");
      String c2 = scanner.nextLine();

      System.out.println("a2 = "+a2);
      System.out.println("b2 = "+b2);
      System.out.println("c2 = "+c2);

   }//end of psvm

}//end of Main