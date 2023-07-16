import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner searchQuery = new Scanner(System.in);
        String searchRegion;

        Author nosov = new Author("Николай", "Носов", 5);
        Book book1 = new Book("Незнайка на Луне", nosov, 1985, 456);
        System.out.println(book1);

        System.out.print("Это большая книга?  ");
        if (book1.isBig()) {
            System.out.println("- Да, в ней целых " + book1.pages + " страниц!");
        } else {
            System.out.println("- Нет, в ней всего " + book1.pages + " страниц");
        }

        System.out.println("Стоимость книги: " + book1.estimatePrice() + " рублей");

        System.out.println("Введите поисковый запрос:");
        searchRegion = searchQuery.nextLine();
        System.out.print("Содержится ли \"" + searchRegion + "\" в описании книги?  ");

        if (book1.matches(searchRegion)) {
            System.out.println(" - Да!");
        } else {
            System.out.println(" - Нет");
        }
    }
}