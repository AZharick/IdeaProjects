public class Throws {
    public static int getFactorial (int j) throws Exception {
        System.out.println("Factorial: ================");
        if (j<1) {
            throw new Exception("Your argument for factorial is less than 1!");
        }
        else {
            int result = 1;
            for (int i = 1; i <= j; i++) {
                result *= i;
            }
            return result;
        }
    }
}
