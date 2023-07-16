public class MultiCatch2 {
    public static void multi (){
        System.out.println("Multiple catch ================");
        try{
            int a = 2/0;
        }
        catch (ArithmeticException | NumberFormatException ex5){
            System.out.println("Сработал множественный перехват! \n");
        }
    }
}
