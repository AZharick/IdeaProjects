import accounts.CreditAccount;
import accounts.SimpleAccount;

public class Main {

   public static void main(String[] args) {
      System.out.println();
      SimpleAccount sacc1 = new SimpleAccount("Simp-1", 5000);
      SimpleAccount sacc2 = new SimpleAccount("Simp-2", 3000);
      sacc1.add(500);
      sacc1.pay(2000);
      sacc1.transfer(sacc2, 500);

      System.out.println("\n\u001b[33m============================\u001b[0m\n");

      CreditAccount cracc1 = new CreditAccount("Cred-1", 30_000);
      CreditAccount cracc2 = new CreditAccount("Cred-2", 30_000);
      cracc1.add(1);
      cracc1.pay(5_000);
      cracc1.add(500);

      System.out.println("\n\u001b[33m===== ПРОВЕРКА ТРАНСФЕРОВ ======\u001b[0m\n");

      cracc1.displayBalance();
      cracc2.displayBalance();
      cracc2.transfer(cracc1, 5000);
      cracc1.displayBalance();
      cracc2.displayBalance();
      cracc2.transfer(cracc1, 1000);

   }//end of psvm

}//end of Main