public class MyExc {
    public static float Division (int a, int b) throws ZeroDivException {
        System.out.println("My Exception ===============");
            if (b==0) throw new ZeroDivException ("Второй аргумент не может быть равен нулю");
        System.out.println("Произвожу деление:");
            return a/b;
    }
}
class ZeroDivException extends Exception {
    public ZeroDivException (String message){
        super(message);
    }
}
