public class OuterClass {
    private static int a = 666;
    private int b = 9000;

    public static class StatNestClass {

        public void writeStaticField () {
            System.out.println("Static field of OuterClass = "+a);
        }

        public void writeNonStaticField () {
            OuterClass obj1 = new OuterClass();
            System.out.println("Non-static field of OuterClass = "+obj1.b);
        }

    }

}
