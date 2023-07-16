package Deals;

public class Expenditure extends Deal {

   private String article;
   private int price;

   // CONSTRUCTOR
   public Expenditure (String article, int price) {
      super();
      this.article = article;
      this.price = price;
      this.setComment("Покупка " + this.article + " на " + price + " руб.");
      setCreditChange(price);
      setDebitChange(0);
      System.out.printf("NEW EXPENDITURE: %s w/CreditChange: %d\n", getComment(), getCreditChange());
   }

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
