public class MAIN {
    public static void main(String[] args) {
        try {
            System.out.println(YourAge.RequestAge());
        }
        catch (InvalidAgeException ex123){
            System.out.println("Exception caught!");
            System.out.println(ex123.getMessage());
        }

        System.out.println("IncrAge: "+YourAge.incrAge());

        YourAge.DisplayAge();

        System.out.println("Final age is: "+YourAge.getAge());

        System.out.println(DivX.DivisionOf8());
        Divider.divide(8, 0);
        ArrayBounds.ArrayShit(5);
        MultiCatch.multi();
        MultiCatch2.multi();
        CatchAll.catchAny();

        Throw.range();
        try {
            Throw2.range();
        }
        catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }

        try {
            System.out.println(Throws.getFactorial(-5));
            }
        catch (Exception e) {
            System.out.println(e.getMessage()+"\n");
        }

        try {
            System.out.println(MyExc.Division(8, 0));
        }
        catch (ZeroDivException exc) {
            System.out.println(exc.getMessage()+"\n");
        }
    }
}
