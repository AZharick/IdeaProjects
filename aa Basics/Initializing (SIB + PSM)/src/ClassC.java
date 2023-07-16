public class ClassC {
    //SIB с инкапсуляцией
    private static int c;

    static {
        c=222;
        System.out.println("*** SIB C ***");
        System.out.println("SIB set c to "+c);
    }

    //GnS ====================
    public static int getC() {
        return c;
    }
    public static void setC(int c) {
        ClassC.c = c;
        System.out.println("setC has set c to: "+c);
    }
}
