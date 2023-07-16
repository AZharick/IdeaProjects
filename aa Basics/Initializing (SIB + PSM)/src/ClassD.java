public class ClassD {
    // PSM
    private static double d;

    private static void initD (){
        d=Math.PI*2;
        System.out.println("PSM set D to "+d);
    }

    static void launchInit (){
        ClassD.initD();
    }

    public static double getD() {
        return d;
    }
    public static void setD(double d) {
        ClassD.d = d;
        System.out.println("Setter set D to "+d);
    }

}
