import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Second {

   public static void main(String[] args) {
      TreeSet<Personn> candidates = new TreeSet<>(new SpacePersonComparator2());
      candidates.add(new Personn("Sonya Popova", 35, 15));   //1
      candidates.add(new Personn("Dazdraperma Sponzhova", 33, 15));  //1
      candidates.add(new Personn("Salavat Netologshvili", 23, 13));  //2
      candidates.add(new Personn("Sasha Sun", 31, 15));   //3
      candidates.add(new Personn("Svetlana Morkov", 38, 15));  //1
      candidates.add(new Personn("Sasha Sosnova", 38, 11));   //4

      Iterator<Personn> it = candidates.iterator();
      System.out.println(it.next());
      System.out.println(it.next());
   }
}

class Personn {
   private String name;
   private int age;
   private int experience;

   public Personn(String name, int age, int experience) {
      this.name = name;
      this.age = age;
      this.experience = experience;
   }

   public String getName() {
      return name;
   }
   public int getAge() {
      return age;
   }
   public int getExperience() {
      return experience;
   }

   @Override
   public String toString() {
      return name;
   }
}

// ====================================================
class SpacePersonComparator2 implements Comparator <Personn>{

   private int countS(String s) {
      int count = 0;
      for (char ch: s.toLowerCase().toCharArray()) {
         if (ch == 's') {
            count++;
         }
      }
      return count;
   }

   @Override
   public int compare(Personn o1, Personn o2) {

      if (o1.getExperience() < o2.getExperience())
         return 1;
      if (o1.getExperience() > o2.getExperience())
         return -1;

      int countS1 = countS(o1.getName());
      int countS2 = countS(o2.getName());

      if (countS1 < countS2) {
         return 1;
      }
      if (countS1 > countS2) {
         return -1;
      }

      if (o1.getName().length() < o2.getName().length())
         return -1;
      if (o1.getName().length() > o2.getName().length())
         return 1;

      else return 0;
   }
}