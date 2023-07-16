public class Divider {
    public static void divide (int a, int b) {
        System.out.println("Zero division: ArithmeticException =================");
        try {
            float c = a/b;
            System.out.printf("Деление успешно: %d divided by %d equals %.3f", a, b, c);
            System.out.println("\n");
        } catch (ArithmeticException ex1) {
            System.out.println("Обнаружена попытка деления на ноль!");
        }
        System.out.println("Продолжение работы программы.. \n");
    }
}
