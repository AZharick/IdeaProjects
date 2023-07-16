import Deals.Deal;
import Deals.Expenditure;
import Deals.Sale;
import taxes.TaxDiffer;
import taxes.TaxIncome;

public class Main {

   public static void main(String[] args) {
      Company company = new Company("Pepsi", new TaxIncome());
      company.setDebit(890);
      company.setCredit(600);

      company.payTaxes();

      company.setTaxSystem(new TaxDiffer());
      company.setDebit(890);
      company.setCredit(600);

      company.payTaxes();
      System.out.println("\n====================\n");

      Sale sale1 = new Sale("Mirinda", 1000);
      Sale sale2 = new Sale("Adrenaline Rush", 2200);
      Expenditure exp1 = new Expenditure("Coca leaves", 4000);
      Deal[] deals = {sale1, sale2, exp1};
      company.setDebit(890);
      company.setCredit(600);

      System.out.println(company.applyDeals(deals));

   }
}
