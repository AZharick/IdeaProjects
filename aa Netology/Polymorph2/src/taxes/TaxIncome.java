package taxes;

public class TaxIncome extends TaxSystem {

   private String name = "Налог на доход";

   @Override
   public int calcTaxFor(int debit, int credit) {
      int tax = credit * 6 / 100;
      if (tax >= 0) {
         return tax;
      } else {
         return 0;
      }
   }

   @Override
   public String toString() {
      return name;
   }
}