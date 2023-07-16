// Netology
public class Netology {

   public static void main(String[] args) {
      Integer i = 100;
      Number n = i;

      Memory<Number> memory = new Memory<>();
      memory.save(3.5);
//        memory.save("Petya");
//        memory.save("Olya");
//        memory.save("Tanya");
//        String value = memory.getLast();

      String v1 = "Petya";
      String v2 = "Olya";
      String result = choose(true, v1, v2);

   } //end of psvm

   public static <T> T choose(boolean flag, T first, T second) {
      if (flag) {
         return first;
      } else {
         return second;
      }
   }

}//end of Netology

class Memory<T> implements Savable<T> {
   protected T value;

   public void save(T value) {
      this.value = value;
   }

   public T getLast() {
      return value;
   }
}

interface Savable<T> {
   void save(T obj);
}