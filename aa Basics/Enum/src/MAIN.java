import java.util.Arrays;

public class MAIN {

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
        SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }

    public enum Pupils {
        John (11), Ann (12);

        private int age;
        int getAge (){
          return age;
        };
        Pupils(int age) {
            this.age=age;
        }
    }

    public static void main(String[] args) {

        System.out.println("MAY's name: " + Month.MAY.name());                                 // MAY
        System.out.println("MAY toString: " + Month.MAY.toString());                           // MAY
        System.out.println("MAY's Ordinal: " + Month.MAY.ordinal());                           // 4
        System.out.println("MAY is equal to JUNE: " + Month.MAY.equals(Month.JUNE));           // false
        System.out.println("MAY is == to JULY: " + (Month.MAY == Month.JULY));                 // false
        System.out.println("MAY's hashCode: " + Month.MAY.hashCode());
        System.out.println("MAY's hashCode: " + Month.MAY.hashCode());
        System.out.println("MAY valueOf MAY.ordinal: " + Month.valueOf("MAY").ordinal());      // 4
        System.out.println("MAY compared to APRIL: " + Month.MAY.compareTo(Month.APRIL));      // 1
        System.out.println("MAY compared to MARCH: " + Month.MAY.compareTo(Month.MARCH));      // 2
        System.out.println("MAY's class: " + Month.MAY.getClass());                            // class MAIN$Month
        System.out.println("MAY's declaring class: " + Month.MAY.getDeclaringClass());         // class MAIN$Month

        System.out.println("\n"+Arrays.toString(Month.values())+"\n");
        for (Month month : Month.values()){
            System.out.print(month+" ");
        }
        System.out.print("\n");

        System.out.println("\nJohn's age is "+Pupils.John.getAge());
        System.out.println("Ann's age is "+Pupils.Ann.getAge());


    }
}
