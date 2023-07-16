import taxes.TaxDiffer;
import taxes.TaxIncome;

public class Main {

   public static void main(String[] args) {
      Company company = new Company("Pepsi", new TaxIncome());
      company.shiftMoney(1000);

      company.payTaxes();

      company.setTaxSystem(new TaxDiffer());
      company.shiftMoney(2000);
      company.shiftMoney(-450);

      company.payTaxes();
   }
}
