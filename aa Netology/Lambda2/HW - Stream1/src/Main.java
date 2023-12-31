import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

      List<Integer> positives = new ArrayList<>(intList.size());
      for (Integer i:intList) {
         if (i>0) {
            positives.add(i);
         }
      }

      List<Integer> evens = new ArrayList<>(positives.size());
      for (Integer i:positives) {
         if (i%2 == 0){
            evens.add(i);
         }
      }

      evens.sort(Comparator.naturalOrder());
      System.out.println(evens);
   }
}