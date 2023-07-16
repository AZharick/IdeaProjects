public abstract class MAIN {

    static void sayHello() {              //процедура, без Оп-ра return
        System.out.println("Hello");
    }
    static void sayBye(){
        System.out.println("Goodbye");    //процедура, без Оп-ра return
    }

    static int sum (int x, int y){        //функция с Оп-ром return
        return x+y;
    }

    static String greet (String name) {   //функция с Оп-ром return
        return "Hello, "+name;
    }

    static float sum (float a, float b, float c) {
        return a+b+c;
    }

    public static void main(String[] args) {
       sayHello();
       sayBye();
       System.out.println(sum (3,4));
       String greeting = greet ("Arni");
       System.out.println(greeting);
       System.out.println("Sum 3 float: "+sum( 34.5f,  23.5f, 12.1f));
       System.out.println("sum 2 int: "+ sum(33, 33));
    }
}
