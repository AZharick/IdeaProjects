public class Main {

   public static void main(String[] args) {
      Calculator calc = Calculator.instance.get();
      int c = 0;

      try {
         int a = calc.plus.apply(1, 2);  //3
         int b = calc.minus.apply(1, 1);  //0

         c = calc.divide.apply(a, b);           //здесь будет деление на ноль
      } catch (ArithmeticException exception) {
         System.out.println("Деление на ноль!");
      } finally {
         calc.println.accept(c);
      }
   }

}