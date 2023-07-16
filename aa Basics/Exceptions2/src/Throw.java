import java.util.Scanner;

public class Throw {
    public static void range (){
        System.out.println("Throw =========================");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число от 5 до 10:");
        int a = sc1.nextInt();
        try {
            if ((a<5) | (a>10)) {
                throw new Exception ("Число "+a+" не находится в диапазоне от 5 до 10!");
            }
            else System.out.println("Вы ввели число "+a);
        }
        catch (Exception ex7) {
            System.out.println(ex7.getMessage());
        }
        System.out.println("Продолжение работы программы Throw.. \n");
    }
}
