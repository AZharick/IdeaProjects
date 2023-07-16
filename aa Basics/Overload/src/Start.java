public class Start {

    static int sum (int x, int y) {
        return x + y;
    }
    static float sum (float a, float b,float c) {       //Overload
        return a + b + c;
    }

        public static void main (String[] args) {
            System.out.println (sum (2,3));
            System.out.println (sum (2.3f, 6.6f, 1.3f));      //calling overloaded M.
        }
}
