import java.util.Scanner;

public class YourAge {
    public static int RequestAge () throws InvalidAgeException {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc1.nextInt();
        if((age<=0) | (age>100)) throw new InvalidAgeException();
        return age;
    }
}
