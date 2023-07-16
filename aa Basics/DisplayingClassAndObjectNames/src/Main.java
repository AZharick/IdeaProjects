public class Main {

   public static void main(String[] args) {

      MyClass obj1 = new MyClass("Object 1");

      System.out.println(obj1.getClass());   // class MyClass
      System.out.println(obj1.name);         // Object 1
      System.out.println(obj1.className);    // MyClass

      System.out.println(obj1.getClass().getName()); // MyClass  REAL!

   }//end of psvm

}//end of Main
