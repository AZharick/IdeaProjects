import java.util.Scanner;

public class YourAge {

    static int age=60;

    public static int RequestAge () throws InvalidAgeException {       //ЭТОТ ОБРАБАТЫВАЕТ НЕЗАВИСИМО
        System.out.println("Enter your age:");
        Scanner sc2 = new Scanner(System.in);
        int age = sc2.nextInt();
        System.out.println("Вы ввели возраст "+age);
        if ((age<=0) | (age>100)) throw new InvalidAgeException ();
        return age;
    }

    public static int incrAge () {                       //ЭТОТ БЕРЕТ 60, ИЗ ТЕЛА КЛАССА
        return age+10;
    }

    public static void DisplayAge () {                   //ЭТОТ БЕРЕТ 60, ИЗ ТЕЛА КЛАССА
        System.out.println("Вы ввели возраст "+age);
    }

    public static int getAge() {                         //ЭТОТ БЕРЕТ 60, ИЗ ТЕЛА КЛАССА
        return age;
    }

    public static void setAge(int age) {
        YourAge.age = age;
    }
}
