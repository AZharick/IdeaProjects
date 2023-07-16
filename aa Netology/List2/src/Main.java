import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

   static List<String> tasks = new ArrayList<>();
   static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      boolean toContinue = true;

      while (toContinue) {
         displayMenu();
         String userResponse = scanner.nextLine();

         switch (userResponse) {

            case "0":
               toContinue = false;
               break;

            case "1":
               addTask();
               break;

            case "2":
               break;

            case "3":
               removeTaskByNumber();
               break;

            case "4":
               removeTaskByName();
               break;

            case "5":
               removeTaskByKeyword();
               break;

            default:
               System.out.println("Такого действия нет!");
               break;

         }//end of switch

         if (toContinue) {
            displayAllTasks();
         }

      }//end of while

   }//end of psvm

   private static void removeTaskByKeyword() {
      System.out.println("Введите ключевое слово для удаления дела: ");
      String keyword = scanner.nextLine();

//      1-й способ препода, НЕРАБОЧИЙ
//      List<String> temp = new ArrayList<>();
//      for (String task : tasks) {
//         if(!tasks.contains(keyword)) {
//            temp.add(task);
//         }
//      }
//      tasks = temp;

      // 1-й способ, скорректированный
      List<String> temp = new ArrayList<>();
      for (int i = 0; i < tasks.size(); i++) {
         if(!tasks.get(i).contains(keyword)) {
            temp.add(tasks.get(i));
         }
      }
      tasks = temp;

      // 2 способ
//      Iterator <String> iterator = tasks.iterator();
//      while (iterator.hasNext()) {
//         String currentTask = iterator.next();
//         if (currentTask.contains(keyword)) {
//            iterator.remove();
//         }
//      }

   }

   private static void removeTaskByName() {
      System.out.println("Введите имя дела для его удаления: ");
      String taskToRemove = scanner.nextLine();
      System.out.printf("Запрошено удаление дела \"%s\", проверка...\n", taskToRemove);

      if(tasks.contains(taskToRemove)) {
         System.out.printf("Дело \"%s\" удалено\n", taskToRemove);
         tasks.remove(taskToRemove);
      } else {
         System.out.println("Такого дела в списке нет!");
      }
   }

   private static void removeTaskByNumber() {
      System.out.println("Введите номер дела для его удаления: ");
      int numberToRemove = Integer.parseInt(scanner.nextLine());
      System.out.println("Запрошено удаление дела №"+numberToRemove+", проверка...");

      if ((numberToRemove-1) <= tasks.size()) {
         System.out.printf("Дело №%d \"%s\" удалено\n", numberToRemove, tasks.get(numberToRemove-1));
         tasks.remove(numberToRemove - 1);
      } else {
         System.out.println("Дела с таким номером в списке нет!");
      }

   }

   private static void displayAllTasks() {
      System.out.println("\n=== ВАШИ ДЕЛА ===");
      for (int i = 0; i < tasks.size(); i++) {
         System.out.printf("%d. %s\n", i+1, tasks.get(i));
      }
   }

   private static void addTask() {
      System.out.print("Введите дело для добавления: ");
      String taskToAdd = scanner.nextLine();
      System.out.printf("Дело \"%s\" добавлено в список\n", taskToAdd);
      tasks.add(taskToAdd);
   }

   private static void displayMenu() {
      System.out.println("\n*** Выберите операцию ***" +
              "\n" +
              "0. Выход из программы\n" +
              "1. Добавить дело\n" +
              "2. Показать дела\n" +
              "3. Удалить дело по номеру\n" +
              "4. Удалить дело по названию\n" +
              "5. Удалить дело по ключевому слову\n" +
              "Ваш выбор: ");
   }

}//end of Main
