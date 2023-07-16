package Deals;

public class Sale extends Deal {

   private String article;
   private int price;

   // CONSTRUCTOR
   public Sale(String article, int price) {
      super();
      this.article = article;
      this.price = price;
      this.setComment("Продажа " + this.article + " на " + price + " руб.");
      setDebitChange(price);
      setCreditChange(0);
      System.out.printf("NEW SALE: %s    w/DebitChange: %d\n", getComment(), getDebitChange());
   }

   //public Sale(String article, int price) {
   //      super();
   //      this.article = article;
   //      this.price = price;
   //      this.setComment("Продажа " + this.article + " на " + price + " руб.");
   //      setDebitChange(price);
   //      setCreditChange(0);
   //      System.out.printf("NEW SALE: %s    w/DebitChange: %d\n", getComment(), getDebitChange());
   //   }

   public String getArticle() {
      return article;
   }

   public void setArticle(String article) {
      this.article = article;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }
}