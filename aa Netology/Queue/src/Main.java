import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

   public static void main(String[] args) {
      List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
      Queue<String> clients = new LinkedList<>(firstClients);

      while (!clients.isEmpty()) {
         String client = clients.poll();
         String newcomer;
         if (Math.random() < 0.5) {
            newcomer = "a friend of " + clients.peek();
            clients.offer(newcomer);
         }

         System.out.println(client);
      }

   }
}