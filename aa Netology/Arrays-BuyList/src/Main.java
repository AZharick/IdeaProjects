import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      String[] product = {"Молоко", "Яйцо", "Хлеб", "Сыр", "Вода", "Кофе", "Чай"};
      int[] price = {100, 48, 76, 149, 60, 225, 180};
      int[] cartQty = new int[product.length];

      displayAvailableProducts(product, price);
      dialog (cartQty, product, price);
      totalCart (product, price, cartQty);
   }

   private static void displayAvailableProducts(String[] product, int[] price) {
      System.out.println("*** Список возможных товаров для покупки: ***");
      for (int i = 0; i < product.length; i++) {
         System.out.print((i + 1) + ". " + product[i] + " = " + price[i] + "₽\n");
      }
   }

   private static void dialog(int[] cartQty, String[] product, int[] price) {
      Scanner sc1 = new Scanner(System.in);
      int preliminarySum = 0;
      while (true) {
         String[] responsePair;
         System.out.println("\u25CF Выберите товар и количество или введите \"end\"");
         String menuResponse = sc1.nextLine();
         if ("end".equals(menuResponse)) {
            break;
         } else {
            responsePair = menuResponse.split(" ");
            int chosenProduct = Integer.parseInt(responsePair[0])-1;
            int chosenQty = Integer.parseInt(responsePair[1]);
            cartQty[chosenProduct] += chosenQty;
            System.out.printf("Добавлено: %s в кол-ве %d шт. на сумму %d ₽\n",
                               product[chosenProduct], cartQty[chosenProduct], chosenQty*price[chosenProduct]);
            preliminarySum += chosenQty*price[chosenProduct];
            System.out.printf("(+%d₽)        ПРЕДВАРИТЕЛЬНАЯ СУММА: %d₽\n",
                                chosenQty*price[chosenProduct], preliminarySum);
         }
      }
   }

   private static void totalCart(String[] product, int[] price, int[] cartQty) {
      int totalSum = 0;
      System.out.println("\n *** Ваша итоговая корзина: ***");
      for (int i = 0; i < cartQty.length; i++) {
         if (cartQty[i] != 0) {
            System.out.println(product[i] + ": " + cartQty[i] + " шт. на сумму " + price[i] * cartQty[i] + "₽");
         }
         totalSum += cartQty[i]*price[i];
      }
      System.out.println("———————————————————————————————————");
      System.out.println("                    ИТОГО: " + totalSum + "₽");
   }

}//конец Main