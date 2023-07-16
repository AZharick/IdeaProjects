public class MAIN {
    static int d = 60;
    static private int e = 2222;
    private int r = 14444;

    static class SNC {
        String name = "John";
        private int b = 666;
        void writeInfo () {
            System.out.println(name+b+d+e);     //ПРЯМОЙ ДОСТУП к любым статич членам внеш. К-са
            MAIN obj2 = new MAIN();
            System.out.println(obj2.r);         //ДОСТУП ч\з О-т к любым нестатич. внеш. членам
        }
    }
    public static void main(String[] args) {
         MAIN.SNC obj1 = new SNC();
         obj1.writeInfo();
    }
}
