import java.util.function.*;

public class Main {

   public static void main(String[] args) {
      Hypotenuse calcHyp = (c1, c2) -> Math.sqrt(c1*c1 + c2*c2);
      System.out.println(calcHyp.calculateHypotenuse(20,40));

      ShitWriter writeIt = () -> System.out.println("SHIT");
      writeIt.writeShit();

      Concatenator conc = ((s1, s2) -> s1 + s2);
      System.out.println(conc.concat("Lambdas are ", "cool"));

      DarkNumber num666 = () -> 666;
      System.out.println(num666.num666());

      Countdown cd = (initialNumber -> {
         for (int i = initialNumber; i >= 0; i--) {
            System.out.print(i + " ");
         }
         System.out.print("\n");
      });
      cd.countDownToZero(30);

      //Built-in FuncInterfaces
      System.out.println("\nBuilt-in FuncInterfaces ============");

      Predicate <String> isContainingShit = s -> s.contains("shit");
      System.out.println(isContainingShit.test("Get this shitty dog away from me!"));

      Function<Integer, String> priceWriter = integer -> integer + " рублей";
      System.out.println(priceWriter.apply(8990));

      Consumer<Integer> discounter = integer -> {
         System.out.println("Старая цена: " + integer);
         System.out.println("Цена со скидкой: " + integer/3);
      };
      discounter.accept(600);

      Supplier <Car> carSupplier = () -> new Car();
      Car Creta = carSupplier.get();
      System.out.println(Creta.getClass().getName());

      UnaryOperator <Integer> cube = integer -> integer*integer*integer;
      System.out.println(cube.apply(3));

      BinaryOperator <Integer> exponentiation = (x, y) -> {
         int result = 1;
         for (int i = 1; i <= y; i++) {
            result *= x;
         }
         return result;
      };
      System.out.println(exponentiation.apply(3,4)); //81

   }
}
