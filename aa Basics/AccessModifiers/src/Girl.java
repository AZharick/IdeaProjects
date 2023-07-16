import Pack1.Person;

public class Girl extends Person {
    public Girl() {
        age=123;    // PROTECTED
    }
    class asd{
        public void DisplayAge(){
            System.out.println(age);    // PROTECTED
        }
    }
}

class asd2 extends Person{
    public void DisplayAge(){
        System.out.println(age);    // NO ACCESS TO PROTECTED
    }
}