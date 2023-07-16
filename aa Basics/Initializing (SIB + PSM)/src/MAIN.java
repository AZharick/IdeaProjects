public class MAIN {
    static int a;

    static {
        a=99;
        System.out.println("*** SIB A ***");
    }

    public static void main(String[] args) {
        System.out.println("a = " + a);
        System.out.println(MAIN.a);
        a=++a;
        System.out.println("++a = " + a);
        System.out.println("\n=====================\n");

        System.out.println("ClassB.b = "+ClassB.b);
        ClassB.Bplus1000();
        System.out.println("\n=====================\n");

        System.out.println("ClassC.getC(): "+ClassC.getC());
        ClassC.setC(ClassC.getC()+333);
        System.out.println("ClassC.getC(): "+ClassC.getC());
        System.out.println("\n=====================\n");

        System.out.println("*** PSM ***");
        ClassD.launchInit();
        System.out.println("ClassD.getD(): "+ClassD.getD());
        ClassD.setD(888);
        System.out.println("ClassD.getD(): "+ClassD.getD());
        System.out.println("\n*** Reinitializing thru PSM: ***");
        ClassD.launchInit();
        System.out.println("ClassD.getD(): "+ClassD.getD());
        System.out.println("\n=====================\n");

        ClassE E1 = new ClassE();                          // здесь срабатывает инициализатор ПЭкз
        System.out.println("E1.getE(): "+E1.getE());
        System.out.println("\n=====================\n");

        ClassF F1 = new ClassF();                           // здесь срабатывает final method initializator ПЭкз
        System.out.println("F1.getF(): "+F1.getF());
        F1.setF(10101010);
        System.out.println("F1.getF(): "+F1.getF());
        System.out.println("*** Reinitializing attempt: ***");
        F1.initF();
        System.out.println("F1.getF(): "+F1.getF());
    }
}