public class MAIN {
    public static void main(String[] args) {

        OuterClass outerObj1 = new OuterClass();
        OuterClass.InnerClass innerObj1 = outerObj1.new InnerClass();

        OuterClass.InnerClass innerObj2 = new OuterClass().new InnerClass();

        innerObj1.innerRequestsOuter();

        outerObj1.outerReqInner();
        outerObj1.outerReqSNC();

        System.out.println(OuterClass.StaticNestedClass.e);

        // ANONYMOUS: см. Edu-AnonClass
    }
}
