import java.util.ArrayList;
import java.util.List;

public class AnimalsList {

   public static void main(String[] args) {

      //обычная реализация =====================
      List animals = new ArrayList();
      animals.add("cat");
      animals.add("dog");
      animals.add("bird");
      Animal kraken = new Animal();
      animals.add(kraken);

      System.out.println(animals.get(1));  //dog
      System.out.println(animals.get(3));  //Animal@58ceff1

      //через дженерики ==========================
      List<String> demons = new ArrayList<>(12);
      demons.add("Baal");
      demons.add("Diablo");
      demons.add("Mephisto");
      //demons.add(kraken);    does not compile
      demons.add(String.valueOf(kraken));  //Animal@58ceff1

      System.out.println(demons.get(3));


   }//end of psvm

}//end of Main

class Animal {
}