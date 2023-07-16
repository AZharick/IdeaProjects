import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      TodoList<String> list = new TodoList<>();
      Scanner scanner = new Scanner(System.in);
      boolean flagToExit = false;

      while (true) {
         if (flagToExit) {
            break;
         }
         list.displayMenu();
         int menuChoice = scanner.nextInt();
         switch (menuChoice) {

            case 0:
               flagToExit = true;
               break;

            case 1:
               scanner.nextLine();   //перехват переноса строки
               System.out.print("Введите новое дело: ");
               String newDeed = scanner.nextLine();
               list.add(newDeed);
               list.showAllDeeds();
               break;

            case 2:
               list.showAllDeeds();
               break;

            case 3:
               System.out.print("Введите номер дела для его удаления: ");
               int numberToRemove = scanner.nextInt();
               if (numberToRemove <= list.size()) {
                  list.removeByNumber(numberToRemove);
                  list.showAllDeeds();
               } else {
                  System.out.println("Такого номера нет!");
               }
               break;

            case 4:
               scanner.nextLine();   //перехват переноса строки
               System.out.print("Введите дело для его удаления: ");
               String deedToRemove = scanner.nextLine();
               if (list.contains(deedToRemove)) {
                  list.removeByName(deedToRemove);
                  list.showAllDeeds();
               } else {
                  System.out.println("Такого дела нет!");
               }
               break;

            case 5:
               System.out.print("Введите ключевое слово для удаления дела: ");
               String keyword = scanner.nextLine();

               List<TodoList> list1 = new ArrayList<>();

               for (Object o : list) {
                  if(!list.contains(keyword)) {
                     list1.add((TodoList) o);
                  }
               }

               list = (TodoList<String>) list1;

         }
      }
      System.out.println("Выход из программы...");
   }
}