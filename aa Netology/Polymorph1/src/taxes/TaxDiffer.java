package taxes;

public class TaxDiffer extends TaxSystem {

   private String name = "Налог на разницу";

   @Override
   public int calcTaxFor(int debit, int credit) {
      int tax = (debit-credit) * 15 / 100;
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