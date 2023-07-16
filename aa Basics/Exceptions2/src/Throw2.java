import java.util.Scanner;

public class Throw2 {
    public static void range () throws Exception {
        System.out.println("Throw2 =========================");
        Scanner sc1 = new Scanner(System.in);
        System.out.println ("Введите число от 5 до 10:");
        int a = sc1.nextInt();
        if ((a<5) | (a>10)) {
            throw new Exception ("Число "+a+" не находится в диапазоне от 5 до 10!");
        }
        else System.out.println("Вы ввели число "+a);
    }
}
