public class MAIN {
    public static void main(String[] args) {
        AnotherClass obj1 = new AnotherClass();
        System.out.println("Outer field is: "+obj1.getOuterField());
        AnotherClass.AnotherInnerClass obj2 = obj1.new AnotherInnerClass();

        System.out.println("Inner field is: "+obj2.getInnerField());
    }
}
