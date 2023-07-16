import java.util.Scanner;

public class DivX {
    public static float DivisionOf8 () {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("На что делить число 8?");
        int div = sc1.nextInt();
        try {
            if (div==0){
                throw new DivisionByZeroException ("Нельзя делить на ноль!");
            }
            return 8/div;
        }
        catch (DivisionByZeroException ex1){
            System.out.println(ex1.getMessage());
        }
        return 1;
    }
}
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}