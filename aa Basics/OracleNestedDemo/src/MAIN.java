public class MAIN {
    public static void main(String[] args) {

        OuterClass outerObj1 = new OuterClass();
        System.out.println("outerRequestsInner:");
        outerObj1.outerRequestsInner();
        System.out.println("\nouterRequestsPrinner:");
        outerObj1.outerRequestsPrinner();
        System.out.println("\nouterRequestsSNC:");
        outerObj1.outerRequestsSNC();
        System.out.println("\nouterRequestsPrSNC:");
        outerObj1.outerRequestsPrSNC();

//        System.out.println("Inner class:");
//        System.out.println("------------");
//
//        OuterClass outerObject = new OuterClass();
//        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
//        innerObject.innerRequestsOuter();
//
//
//        System.out.println("\nStatic nested class:");
//        System.out.println("--------------------");
//        OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();
//        staticNestedObject.SNCRequestsOuter(outerObject);
//
//        System.out.println("\nTop-level class:");
//        System.out.println("--------------------");
//        TopLevelClass topLevelObject = new TopLevelClass();
//        topLevelObject.accessMembers(outerObject);
    }
}
