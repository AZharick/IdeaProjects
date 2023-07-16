package taxes;

public class TaxDiffer extends TaxSystem{

   private String name = "Налог на прибыль";

   @Override
   public int calcTaxFor(int debit, int credit) {
      int tax = (credit-debit) * 15 / 100;
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
