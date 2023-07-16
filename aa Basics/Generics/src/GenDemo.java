//Шилдт
public class GenDemo {
   public static void main(String[] args) {
      //Gen<Integer> integerGen = new Gen<Double>(123D);     не канает, Type mismatch

      Gen<Integer> integerObj = new Gen<>(88);        // autoboxing, Integer здесь - АРГУМЕНТ ТИПА
      System.out.println(integerObj);                       // Gen@7c30a502
      //int v = integerObj.getObj().intValue();             // works, no autounboxing
      int v = integerObj.getObj();                          // autounboxing
      System.out.println("integerObj.getObj: " + v);        // 88
      integerObj.showType();                                // Типом Т является java.lang.Integer

      Gen<String> stringObj = new Gen<>("Mario");
      System.out.println(stringObj.getObj());               // Mario
      stringObj.showType();                                 // Типом Т является java.lang.String

      //integerObj = stringObj;                             // ERROR: type mismatch

      System.out.println("\n====================\n");

      TwoGen<Integer, String> twoGen = new TwoGen<>(100, "Hello");

      twoGen.showTypes();
      System.out.println(twoGen.getObjT());
      System.out.println(twoGen.getObjV());

   }//end of psvm
}//end of GenDemo

// ========================

class Gen<T> {    // T - параметр типа, заменяемый реальным типом при созд-и О-та Gen
   T obj;   // объявление О-та типа Т

   //передача в К-р ссылки на О-т типа Т
   Gen(T object) {
      obj = object;
   }

   // возвращение О-та типа Т
   T getObj() {
      return obj;
   }

   // вывод типа Т
   void showType() {
      System.out.println("Типом Т является " + obj.getClass().getName());
   }
}//end of Gen class

class TwoGen<T, V> {
   T obj1;
   V obj2;

   TwoGen(T o1, V o2) {
      obj1 = o1;
      obj2 = o2;
   }

   T getObjT() {
      return obj1;
   }

   V getObjV() {
      return obj2;
   }

   void showTypes() {
      System.out.println("Тип Т — это " + obj1.getClass().getName());
      System.out.println("Тип V — это " + obj2.getClass().getName());
   }

}//end of TwoGen class