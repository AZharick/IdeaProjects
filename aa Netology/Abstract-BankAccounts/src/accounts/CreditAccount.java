package accounts;

public class CreditAccount extends Account {

   long limit;

   public CreditAccount(String name, long limit) {
      this.setAccName(name);
      System.out.printf("\u25cf Создан новый Кредитный Счёт \"%s\" с лимитом %d₽!\n", name, limit);
      this.limit = limit;
      setBalance(limit);
   }

   @Override
   public boolean add(long amount) {
      long postBalance = getBalance() + amount;
      if (isRecipientReady(this, amount)) {
         setBalance(postBalance);
         System.out.printf(GREEN_DOT + "%s: +%d₽\n", getAccName(), amount);
         displayBalance();
         return true;
      } else {
         System.out.printf(RED_DOT + "Баланс счёта %s превысит кредитный лимит на %d₽, операция отменена!\n", getAccName(), postBalance - limit);
         return false;
      }
   }

   @Override
   public boolean pay(long amount) {
      long postBalance = getBalance() - amount;
      if (postBalance >= 0) {
         setBalance(postBalance);
         System.out.printf(RED_DOT + "%s: -%d₽ \n", getAccName(), amount);
         displayBalance();
         return true;
      } else {
         System.out.printf(RED_DOT + "%s: Лимит исчерпан, покупка отменена!\n", getAccName());
         return false;
      }
   }

   @Override
   public boolean isRecipientReady(Account account, long amount) {
      long postBalance = account.getBalance() + amount;
      if ((postBalance) <= limit) {
         return true;
      } else {
         return false;
      }
   }

}