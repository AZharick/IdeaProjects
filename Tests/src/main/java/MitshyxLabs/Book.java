package MitshyxLabs;

public class Book {
   private String name, author;
   private int pages;

   public Book(String name, String author, int pages) {
      this.name = name;
      this.author = author;
      this.pages = pages;
   }

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
}
