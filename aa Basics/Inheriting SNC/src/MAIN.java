public class MAIN {
    public static void main(String[] args) {
        OuterClass.StatNestClass obj1 = new OuterClass.StatNestClass();
        obj1.writeStaticField();
        obj1.writeNonStaticField();

        AnotherClass obj2 = new AnotherClass();
        obj2.writeStaticField();
        obj2.writeNonStaticField();
    }
}
