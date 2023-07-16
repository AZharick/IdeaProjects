public class MAIN {
    //https://topjava.ru/blog/gettery-i-settery-v-java
    //ошибки при использовании обычных GnS со ссылочными типами
    public static void main(String[] args) {
        Book book1 = new Book();

        //ДЕМО ОШИБКИ С СЕТТЕРОМ
        int[] myDigs = {5, 5, 4, 3, 2};
        book1.setDigits(myDigs);
        System.out.println("book1.digits' init values:");
        book1.displayDigits();

        System.out.println("Попытка изменить данные...");
        myDigs[1] = 1;
        book1.displayDigits();

        System.out.println("\n======================\n");
        //ДЕМО ОШИБКИ С ГЕТТЕРОМ

        int[] myDigs2 = {6, 6, 6};

        book1.setDigits(myDigs2);
        book1.displayDigits();

        int[] substitute = book1.getDigits();
        substitute[1] = 1;
        book1.displayDigits();

    }
}
