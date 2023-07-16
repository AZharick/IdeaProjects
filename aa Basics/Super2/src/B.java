public class B extends A {
    int num = 123;

    protected void writeParentsNum (){
        System.out.println(super.num);     //666 of A
    }
}
