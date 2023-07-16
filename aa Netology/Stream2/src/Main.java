import java.util.*;
import java.util.stream.Collectors;

public class Main {

   public enum Sex {
      MAN,
      WOMAN
   }

   public enum Education {
      ELEMENTARY,
      SECONDARY,
      FURTHER,
      HIGHER
   }

   public static void main(String[] args) {
      List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
      List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");

      Collection<Person> persons = new ArrayList<>();

      for (int i = 0; i < 10_000_000; i++) {
         persons.add(new Person(
                 names.get(new Random().nextInt(names.size())),
                 families.get(new Random().nextInt(families.size())),
                 new Random().nextInt(100),                        //age
                 Sex.values()[new Random().nextInt(Sex.values().length)],
                 Education.values()[new Random().nextInt(Education.values().length)])
         );
      }

      //несовершеннолетних
      long count = persons.stream()
              .filter(x -> x.getAge()>=18)
              .count();
      System.out.println("\nНесовершеннолетних: " + count);

      //призывников
      List<String> recruits = persons.stream()
              .filter(x -> x.getSex() == Sex.MAN)
              .filter((x -> x.getAge() >=18))
              .filter(x -> x.getAge() < 27)
              .map(Person::getFamily)
              .collect(Collectors.toList());
      System.out.println("\nПризывники: \n" + recruits);

      //работоспособные
      List<String> workers = persons.stream()
              .filter(x -> x.getEducation() == Education.HIGHER)
              .filter(x -> x.getAge() >= 18)
              .filter(x -> (x.getSex() == Sex.WOMAN) ? (x.getAge() < 60) : (x.getAge() < 65))
              .map(x -> x.getFamily())
              .collect(Collectors.toList());
   }
}
