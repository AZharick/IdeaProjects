package accounts;

public abstract class Account {

   private String accName;
   private long balance;

   public static final String RED_DOT = "\u001b[31m\u25cf \u001b[0m";
   public static final String GREEN_DOT = "\u001b[32m\u25cf \u001b[0m";
   public static final String BLUE_DOT = "\u001b[34m\u25cf \u001b[0m";

   public abstract boolean add(long amount);

   public abstract boolean pay(long amount);

   public abstract boolean isRecipientReady(Account account, long amount);

   public boolean transfer(Account account, long amount) {
      long balance = getBalance();
      System.out.printf("\u25cf Попытка перевода %d₽ с %s на %s...\n", amount, getAccName(), account.getAccName());
      if ((balance >= amount)) {
         if (isRecipientReady(account, amount)) {
            this.pay(amount);
            account.add(amount);
            System.out.printf(GREEN_DOT + "Совершен перевод со счёта %s на счёт %s на сумму %d₽\n", getAccName(), account.getAccName(), amount);
            displayBalance();
            return true;
         } else {
            System.out.printf(RED_DOT + "Переполнение лимита счёта-получателя %s, операция отменена!\n", account.getAccName());
            return false;
         }
      } else {
         System.out.println(RED_DOT + "Недостаточно средств на счёте для перевода!");
         return false;
      }
   }

   public void displayBalance() {
      System.out.printf(BLUE_DOT + "%s баланс: %d₽\n", getAccName(), getBalance());
   }

   // GnS =================
   public long getBalance() {
      return balance;
   }

   public void setBalance(long balance) {
      this.balance = balance;
   }

   public String getAccName() {
      return accName;
   }

   public void setAccName(String accName) {
      this.accName = accName;
   }
}