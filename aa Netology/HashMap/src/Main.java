import java.util.*;

public class Main {

   public static void main(String[] args) {
      Address addressRus = new Address("Russia", "Moscow");
      Address addressStates = new Address("USA", "Washington");
      Address addressFin = new Address("Finland", "Kotka");
      Address addressIndia = new Address("India", "Delhi");

      Map<Address, Integer> costPerAddress = new HashMap<>();
      costPerAddress.put(addressRus, 100);
      costPerAddress.put(addressFin, 200);
      costPerAddress.put(addressStates, 500);
      costPerAddress.put(addressIndia, 350);

      Scanner scanner = new Scanner(System.in);
      Set<String> countriesOrdered = new HashSet<>();
      int totalPrice = 0;

      while (true) {

         System.out.println("Введите страну доставки или \"end\"");
         String orderCountry = scanner.nextLine();
         if ("end".equals(orderCountry) || "утв".equals(orderCountry)) {
            break;
         }
         
         countriesOrdered.add(orderCountry);

         System.out.println("Введите город доставки:");
         String orderCity = scanner.nextLine();

         System.out.println("Введите вес груза:");
         int weight = Integer.parseInt(scanner.nextLine());

         Address address = new Address(orderCountry, orderCity);

         if (costPerAddress.containsKey(address)) {
            int orderPrice = weight * costPerAddress.get(address);
            System.out.println("Стоимость доставки этого заказа составит " +
                    orderPrice +
                    " руб.");
            totalPrice += orderPrice;
            System.out.println("Сумма всех доставок: " + totalPrice + " руб.");
            System.out.println("Заказанные страны: "+countriesOrdered);

         } else {
            System.out.println("Такой адрес не обслуживается");
         }
      }

      System.out.println("Выход из программы...");

   }//end of psvm

}//end of Main
