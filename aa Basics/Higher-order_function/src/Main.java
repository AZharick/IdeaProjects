import java.util.function.IntUnaryOperator;

public class Main {

   public static void main(String[] args) {
      var g = twice(Main::addFive);
      System.out.println(g.applyAsInt(7)); // 13
   }

   public static int addFive(int x) {
      return x+5;
   }

   private static IntUnaryOperator twice(IntUnaryOperator f) {
      return f.andThen(f);
   }

}