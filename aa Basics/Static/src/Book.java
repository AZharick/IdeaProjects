public class Book {
    private String name, author;
    private int pages, year, no;
    private static int id = 0; //нумерация книг

    //GnS ==============================
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getYear() {
        return year;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Book.id = id;
    }

    //constructor =============================
    Book (String name, String author, int pages, int year){
        no=++id;
        System.out.println("\nСоздана новая книга:");
        System.out.println("Номер: "+no);
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
        System.out.println("Pages: "+pages);
        System.out.println("Year: "+year);
    }
}
