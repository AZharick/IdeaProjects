import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        //1-я фишка
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter int:");
        int x = sc1.nextInt();
        System.out.println("Enter double:");
        double d = sc1.nextDouble();
        System.out.println("Enter a word:");
        String s = sc1.next();

        System.out.println("================");
        System.out.println("You entered: "+x+" "+d+" "+s);

        //2-я фишка
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter int, double and text:");
        int x2 = sc2.nextInt();
        double d2 = sc2.nextDouble();
        String s2 = sc2.next();

        System.out.println("================");
        System.out.println("You entered: "+x2+" "+d2+" "+s2);
    }
}
