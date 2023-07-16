public class Start {
    public static void main(String[] args) {
        Parent elder = new Parent();
        Child1 vuduagebaby = new Child1();
        Child2 krikyn = new Child2();
        Child3INQ curious = new Child3INQ();
        GrandChild young = new GrandChild();
        GrandChild2 young2 = new GrandChild2();

        System.out.println("Parent: ========================================");
        elder.ololo();
        System.out.println("CH1, OVERLOAD age/chant ========================");
        vuduagebaby.ololo();
        vuduagebaby.ololo(123); //метод использует ПАРАМЕТРЫ, вызывающий код передаёт АРГУМЕНТЫ
        vuduagebaby.ololo("RATAMAHATTA");
        System.out.println("CH2, OVERRIDE Parent ============================");
        krikyn.ololo();
        System.out.println("CH3, OVERRIDE Parent ===========================");
        curious.ololo();
        System.out.println("GrCH4, super ololo: ============================");
        young.ololo();
        System.out.println("GrCH5, super VAR: ==============================");
        young2.ololo("BALABOLKA!!");
    }
}
