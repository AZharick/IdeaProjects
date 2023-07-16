import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      int minLength;
      int maxRepeats;

      System.out.println();
      Scanner scanner = new Scanner(System.in);
      PasswordChecker checker = new PasswordChecker();

      System.out.print("Введите минимальную длину пароля: ");
      try {
         minLength = scanner.nextInt();
         checker.setMinLength(minLength);
      } catch (IllegalArgumentException illegalArgumentException) {
         System.out.println(illegalArgumentException.getMessage());
      }

      System.out.print("Введите максимальное допустимое кол-во повторов символа: ");
      try {
         maxRepeats = scanner.nextInt();
         checker.setMaxRepeats(maxRepeats);
      } catch (IllegalArgumentException illegalArgumentException) {
         System.out.println(illegalArgumentException.getMessage());
      }

      String empty = scanner.nextLine();  //пойман перенос строки

      try {
         if (checker.areSettersOK()) {
            while (true) {
               System.out.print("\u25cf Введите пароль или \"end\": ");
               String password = scanner.nextLine();

               if ("end".equals(password) || "утв".equals(password)) {
                  System.out.println("Выход из программы...");
                  break;
               } else {

                  if (checker.verify(password)) {
                     System.out.println("Пароль подходит!");
                  } else {
                     System.out.println("Пароль не подходит!");
                  }
               }

            }//end of while
         }
      } catch (IllegalStateException illegalStateException) {
         System.out.println(illegalStateException.getMessage());
      }

   }//end of psvm

}//end of Main
