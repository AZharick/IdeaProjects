public class MAIN {
    private String name = "Alex";
    public static void main(String[] args) {
        final int a = 666;
        MAIN obj1 = new MAIN();
        Hello obj2 = new Hello() {
            @Override
            void sayHello() {
                System.out.println("WELCOME!!!!!  -  "+a+" - "+obj1.name);
            }
        };
        obj2.sayHello();
    }
}