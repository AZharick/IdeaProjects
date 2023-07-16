import taxes.TaxDiffer;
import taxes.TaxIncome;

public class Main {

   public static void main(String[] args) {
      Company company = new Company("Pepsi", new TaxIncome());
      company.setDebit(600);
      company.setCredit(890);

      company.payTaxes();

      company.setTaxSystem(new TaxDiffer());
      company.setDebit(600);
      company.setCredit(890);

      company.payTaxes();
   }
}
