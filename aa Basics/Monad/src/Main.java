import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

   // метод взят с Нетологии, остальное писал сам, я хз
   public static List<Integer> multiplyListWithFilter(Collection<Integer> collection) {
      return collection.stream()
              .filter(e -> e % 2 == 0)
              .map(e -> e * 2)
              .collect(Collectors.toList());
   }

   public static void main(String[] args) {
       Collection <Integer> coll1 = new ArrayList<>();
       coll1.add(1);
       coll1.add(2);
       coll1.add(3);

      System.out.println(multiplyListWithFilter(coll1));
   }

}