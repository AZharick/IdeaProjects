import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
   private static Scanner scanner;
   private static List<Template> templateList;

   public static void main(String[] args) {
      templateList = new LinkedList<>();
      addNewTemplate();

   }

   // ================ METHODS ========================

   public static boolean askIsItShell(Scanner sc) {
      boolean result = false;
      boolean flagToExit = false;

      while (true) {
         System.out.print("Это шаблоны на обшивку?\\Это серия шаблонов? (Y\\N): ");
         String answer = scanner.nextLine().toLowerCase(Locale.ROOT);
         if (!answer.isBlank()) {
            switch (answer) {
               case "y":
                  result = true;
                  flagToExit = true;
                  break;
               case "n":
                  result = false;
                  flagToExit = true;
                  break;
               default:
                  System.out.println("Введите Y или N");
                  break;
            }
         } else {
            System.out.println("Поле ответа не может быть пустым!");
         }
         if (flagToExit) break;
      }
      return result;
   }

   public static int askOrder(Scanner s) {
      int result = 0;
      boolean flagToExit = false;

      while (true) {
         System.out.print("Введите номер заказа: ");
         String answer = scanner.nextLine();
         if (!answer.isBlank()) {
            try {
               result = Integer.parseInt(answer);
               flagToExit = true;
            } catch (NumberFormatException e) {
               System.out.println("Нужно ввести целое число!");
            }
         } else {
            System.out.println("Поле ответа не может быть пустым!");
         }
         if (flagToExit) break;
      }
      return result;
   }

   public static int askSection(Scanner s) {
      int result = 0;

      Scanner scanner = new Scanner(System.in);
      

      return result;
   }

   public static void addNewTemplate() {
      Template template = new Template();
      scanner = new Scanner(System.in);
      System.out.println("Добавление нового шаблона");
      if (askIsItShell(scanner)) template.setShell(true); else template.setShell(false);
      template.setOrder(askOrder(scanner));
      template.setSection(askSection(scanner));


      System.out.println("Order: " + template.getOrder());
      System.out.println("Section: " + template.getSection());

      templateList.add(template);

   }

   public int[] processResponse(String str) {
      boolean flagToExit = false;
      while (true) {

         if (!str.isBlank()) {

            try {
               if (!str.contains(","))

                  result = Integer.parseInt(str);
               flagToExit = true;
            } catch (NumberFormatException e) {
               System.out.println("Нужно ввести целое число!");
            }

         } else {
            System.out.println("Поле ответа не может быть пустым!");
         }

         if (flagToExit) break;
      }




      return new int[]{0, 0};
   }

   public void findTemplate() {
   }

   public void deleteTemplate() {
   }

   public void addPairOrder() {
   }

   public void addPairSection() {
   }
}
