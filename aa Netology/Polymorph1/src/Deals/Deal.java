package Deals;

public class Deal {

   private String comment;
   private int creditChange;  //расходы
   private int debitChange;   //доходы

   // CONSTRUCTOR
   public Deal() {}

   // CONSTRUCTOR
   public Deal(String comment, int creditChange, int debitChange) {
      System.out.printf("NEW DEAL: %s w/creditChange: %d w/debitChange: %d\n", comment, creditChange, debitChange);
      this.comment = comment;
      this.creditChange = creditChange;
      this.debitChange = debitChange;
   }

   // GnS ===========================
   public String getComment() {
      return comment;
   }
   public void setComment(String comment) {
      this.comment = comment;
   }
   public int getCreditChange() {
      return creditChange;
   }
   public void setCreditChange(int creditChange) {
      this.creditChange = creditChange;
   }
   public int getDebitChange() {
      return debitChange;
   }
   public void setDebitChange(int debitChange) {
      this.debitChange = debitChange;
   }
}
