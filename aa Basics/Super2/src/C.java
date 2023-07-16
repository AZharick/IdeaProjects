public class C extends B {

    @Override
    void writeParentsNum() {
        System.out.println(super.num);      //123 of B
    }

    void writeTopNum () {
        A obj = new A();
        System.out.println(obj.num);        //666 of A
    }
}
