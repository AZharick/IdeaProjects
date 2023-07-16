import java.util.Scanner;
                        //SWITCH CASE, BREAK, SCANNER, NEXTINT, NEXTDOUBLE, NEXT,NEXTLINE
public class SwitchCase {
    public static void main (String[] args){
        //Scanner, Case, nextInt;
        String monthStr;
        System.out.print("Enter a month number: ");
        Scanner month = new Scanner(System.in); // System.in - станд. поток входных данных
        int a = month.nextInt();
        switch (a) {
            case 1:
                monthStr = "Январь";
                System.out.println("bir");
                break;
            case 3:
                monthStr = "Март";
                System.out.println("bir");
                break;
            default:
                monthStr = "Неизвестен";
                System.out.println("bir");
                break;
        }
        System.out.println(monthStr);



        //nextDouble;
        System.out.print("Enter entire salary: ");
        Scanner salary = new Scanner(System.in);
        double b = salary.nextDouble();
        System.out.print("Enter hour payment: ");
        Scanner hourpay = new Scanner(System.in);
        double c = hourpay.nextDouble();
        System.out.println("Your working time is: " + b/c + " hours");

        // String reading, next, nextLine
        System.out.print("Enter your name: ");
        Scanner name = new Scanner(System.in);
        String d = name.next(); //next читает слово до пробела, не реагирует на пустой ввод (на тупо "Enter")

        System.out.print("Enter your last name (double surname acceptable): ");
        Scanner lastname = new Scanner(System.in);
        String e = lastname.nextLine(); // nextLine читает всю строку, реагирует на пустой ввод (на тупо "Enter")
        System.out.println("Your account is: " + d + " " + e);
    }
}
