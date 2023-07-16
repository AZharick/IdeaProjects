public class ClassB {
    //SIB без инкапсуляции
    static int b;

    static {
        b=666;
        System.out.println("*** SIB B ***");
    }

    static void Bplus1000 (){
        b=b+1000;
        System.out.println("B+1000 = " + b);
    }

}
