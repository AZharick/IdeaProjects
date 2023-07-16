public class MAIN {
    public static void main(String[] args) {
         try {
             System.out.println("Your age is: "+YourAge.RequestAge());
         }
         catch (InvalidAgeException ex1){
             System.out.println(ex1.getMessage());
         }
    }
}
