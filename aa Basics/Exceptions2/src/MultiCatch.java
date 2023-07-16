public class MultiCatch {
    public static void multi () {
        System.out.println("Two catches for one try ====================");
        try {
            int a = 3;
            int b = Integer.parseInt("asd");
            System.out.println(a+"/0 = "+(a/0));
        }
        catch (NumberFormatException ex3){
            System.out.println("Искл.1: Неверный аргумент \n");
        }
        catch (ArithmeticException ex4){
            System.out.println("Искл.2: Деление на ноль \n");
        }

    }
}
