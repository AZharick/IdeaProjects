import Deals.Deal;
import taxes.TaxSystem;

public class Company {
   private String title;
   private int debit = 0;
   private int credit = 0;
   TaxSystem taxSystem;

   // CONSTRUCTOR
   public Company (String title, TaxSystem taxSystem) {
      System.out.printf("У компании %s система налогообложения: \"%s\"\n", title, taxSystem.toString());
      this.title = title;
      this.taxSystem = taxSystem;
   }

   // methods
   public void shiftMoney(int amount) {
      if (amount>0) {
         debit += amount;
      } else {
         if (amount<0) {
            credit += Math.abs(amount);
         }
      }
   }

   public void payTaxes() {
      int tax = taxSystem.calcTaxFor(debit, credit);
      System.out.printf("Компания %s уплатила налог в размере: %d руб.\n", title, tax);
      debit = 0;
      credit = 0;
   }

   public int applyDeals(Deal[] deals) {
      for (Deal d:deals) {
         //debit += deals.g
         d.getComment();
      }
      int differenceToReturn = debit-credit;
      payTaxes();
      return differenceToReturn;
   }

   //GnS ========================
   public int getDebit() {
      return debit;
   }
   public void setDebit(int debit) {
      this.debit = debit;
   }
   public int getCredit() {
      return credit;
   }
   public void setCredit(int credit) {
      this.credit = credit;
   }
   public TaxSystem getTaxSystem() {
      return taxSystem;
   }
   public void setTaxSystem(TaxSystem taxSystem) {
      System.out.printf("Компания %s сменила СНО на \"%s\"\n", title, taxSystem.toString());
      this.taxSystem = taxSystem;
   }
}