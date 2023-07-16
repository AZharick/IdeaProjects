public class MAIN {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.writeParentsNum();        //666 of A

        C obj2 = new C();
        obj2.writeParentsNum();        //123 of B
        obj2.writeTopNum();            //666 of A

    }
}
