public class MAIN {
    public static void main(String[] args) {

        Book book1 = new Book("Anna", "John", 195, 1997);
        Book book2 = new Book("No way", "Mary", 989, 2000);
        Book book3 = new Book("Pink Floyd", "Bomb", 666, 1985);

        System.out.println("\nbook1.getNo(): "+book1.getNo());

        System.out.println("\nВсего книг: "+Book.getId());
    }
}
