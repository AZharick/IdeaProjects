public class OuterClass {
    private int OuterField = 666;
    private static int OuterStaticField = 5000;

    public void writeOuter () {
        class asd extends Car {

        }
        System.out.println("Outer: "+OuterField);
    }
    
    class InnerClass1
    {
        public void writeOuter (){
            System.out.println("Inner Parent: "+OuterField);
        }
    }
    
    class InnerClass2 extends InnerClass1
    {
        @Override
        public void writeOuter () {
            System.out.println("Inner Descendant: "+OuterField);
        }
    }

    public static class InnerStaticClass3 {

        public void writeOuterStatic() {
            System.out.println("OuterStaticField = "+OuterStaticField);
        }

        public static void writeOuter() {
            OuterClass obj0 = new OuterClass();
            System.out.println("OuterNonStaticField = "+obj0.OuterField);
        }

    }
}
