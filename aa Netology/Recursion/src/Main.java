import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {
      compare(1);  //4
      compare(2);  //1
      compare(5);  //8
      compare(15); //2
   }

   public static void compare(int day) {
      System.out.println("=== Day " + day + " ===");
      int[] startNumbers = { 21, 1, 20, 23 };
      int iterative = chooseHobbyIterative(startNumbers, day);
      int recursive = chooseHobbyRecursive(startNumbers, day);
      System.out.println("Iterative = " + iterative + " | Recursive = " + recursive);
      System.out.println();
   }

   // Каждый следующий номер хобби получается по правилу: берутся предыдущий день и за два дня до него, перемножаются,
   // берётся %10, затем прибавляется 1.
   // Каждое такое число будет от 1 до 10 и являться номером хобби.

   // Каждый вызов сперва вычислит предыдущее число, затем пре-пре-предыдущее.
   // Если вычисляемое выше число является одним из стартовых чисел, то просто берем это число как результат.
   // Иначе, если вычисляемое промежуточное значение - это номер хобби для одного из дней - алгоритм запускается рекурсивно для этого дня.

   public static int chooseHobbyRecursive(int[] startNumbers, int day) {
//        int prev = ??? // предыдущее значение
//        int prePrePrev = ??? // пре-пре-предыдущее значение
//        return prev * ...;

      int prev = chooseHobbyRecursive(startNumbers,day-1);
      int prePrePrev = chooseHobbyRecursive(startNumbers,day-3);


      return chooseHobbyRecursive();
   }

   public static int chooseHobbyIterative(int[] startNumbers, int day) {
      List<Integer> numbers = new ArrayList<>();

      numbers.add(startNumbers[0]);
      numbers.add(startNumbers[1]);
      numbers.add(startNumbers[2]);
      numbers.add(startNumbers[3]);

      for (int d = 0; d < day; d++) {
         int index = d + 4; // индексы дней в массиве сдвинуты на 4
         int prev = numbers.get(index - 1); // предыдущее значение
         int prePrePrev = numbers.get(index - 3); // пре-пре-предыдущее значение
         numbers.add((prev * prePrePrev) % 10 + 1);
      }

      return numbers.get(numbers.size() - 1);
   }
}