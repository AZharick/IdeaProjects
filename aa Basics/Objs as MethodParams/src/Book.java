public class Book {
    private String name, author;
    private int year;

    Book (String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
        System.out.println ("\n* New book created: "+ getName() + " by " + getAuthor() + " of " + getYear());
    }

    public void displayInfo(Book b){
        System.out.println("\n==== Info: ====");
        System.out.println("Name: "+ b.getName());
        System.out.println("Author: "+ b.getAuthor());
        System.out.println("Year: "+ b.getYear());
    }

    //GnS ===================================
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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
