public class Main {

   public static void main(String[] args) {

      Multiplier multiplier = ((a, b) -> a*b);
      System.out.println(multiplier.calculate(2, 3));  //6

   }
}