public class Child extends Parent {

    static void staticMethod() {
        System.out.println("Child: staticMethod");
    }

//    final static void finalStaticMethod() {                //compile-time error, can't be overridden
//        System.out.println("Child: finalStaticMethod");
//    }
}