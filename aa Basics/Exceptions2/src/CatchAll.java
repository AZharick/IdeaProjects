public class CatchAll {
    public static void catchAny (){
        System.out.println("Catching Exception type ==================");
           try {
            int c = 3/0;
        }
        catch (Exception ex6) {
            System.out.println("Перехвачено исключение типа Exception! \n");
        }
    }
}
