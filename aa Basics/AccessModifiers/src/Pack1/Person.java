package Pack1;

public class Person {
    public String name;
    protected int age;
    private String race;

    public void DisplayRace (){
        System.out.println(race);          // PRIVATE
        System.out.println(age);           // PROTECTED
    }

    class asdq {
        public void UltraRDisplayAge (){
            System.out.println(race);      // PRIVATE
            System.out.println(age);       // PROTECTED
        }
    }
}

class asdq2 {
    public void UltraRDisplayAge (){
        //System.out.println(race);       // NO ACCESS TO PRIVATE
        //System.out.println(age);        // NO ACCESS TO PROTECTED
    }
}






