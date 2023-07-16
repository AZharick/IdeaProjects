public class Book {
    public String title;
    public int releaseYear, pages;
    public Author author;

    //CONSTRUCTOR
    public Book(String title, Author author, int releaseYear, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;
        System.out.println("\n  ***** Получена информация о новой книге! *****");
    }

    //METHODS
    public boolean isBig() {
        return pages > 500;
    }

    public int estimatePrice() {
        int spookyLogic = (int) Math.floor((3 * pages) * Math.sqrt(author.rating));
        if (spookyLogic < 250) {
            return 250;
        } else {
            return spookyLogic;
        }
    }

    public boolean matches(String region) {
        if (title.contains(region) || author.name.contains(region) || author.surname.contains(region)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return ("\"" + title + "\", (" + author.name + " " + author.surname + ") издания "
                + releaseYear + "-го года, " + pages + " страниц");
    }

    //END OF METHODS SECTION
}
