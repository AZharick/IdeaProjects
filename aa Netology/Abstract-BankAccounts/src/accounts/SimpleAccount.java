package accounts;

public class SimpleAccount extends Account {

   public SimpleAccount(String name, long balance) {
      super();
      this.setAccName(name);
      setBalance(balance);
      System.out.printf("\u25cf Создан новый Простой Счёт \"%s\" с балансом %d₽!\n", name, getBalance());
   }

   @Override
   public boolean add(long amount) {
      long balance = getBalance();
      setBalance(balance + amount);
      System.out.printf(GREEN_DOT + "%s: +%d₽!\n", getAccName(), amount);
      displayBalance();
      return true;
   }

   @Override
   public boolean pay(long amount) {
      long balance = getBalance();
      if (amount <= balance) {
         setBalance(balance -= amount);
         System.out.printf(RED_DOT + "%s: -%d₽!\n", getAccName(), amount);
         displayBalance();
         return true;
      } else {
         System.out.printf(RED_DOT + "%s: недостаточно средств!\n", getAccName());
         return false;
      }
   }

   @Override
   public boolean isRecipientReady(Account account, long amount) {
      return true;
   }

}