import java.util.ArrayList;

public class TodoList<T> extends ArrayList {

   public void displayMenu() {
      System.out.print("\n*** Выберите операцию ***" +
              "\n" +
              "0. Выход из программы\n" +
              "1. Добавить дело\n" +
              "2. Показать дела\n" +
              "3. Удалить дело по номеру\n" +
              "4. Удалить дело по названию\n" +
              "5. Удалить дело по ключевому слову\n" +
              "Ваш выбор: ");
   }

   public void showAllDeeds() {
      if (this.isEmpty()) {
         System.out.println("Список дел пуст!");
      } else {
         System.out.println("\n==== ВАШИ ДЕЛА ====");
         for (int i = 0; i < this.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, this.get(i));
         }
      }
   }

   public void removeByNumber(int number) {
      System.out.printf("Дело №%d (%s) удалено\n\n", number, this.get(number - 1));
      this.remove(number - 1);
   }

   public void removeByName(String name) {
      System.out.printf("Дело №%d (%s) удалено\n",this.indexOf(name)+1, name);
      this.remove(name);
   }

   public void removeByKeyword(String keyword)

}