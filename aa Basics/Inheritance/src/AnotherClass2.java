public class AnotherClass2 extends OuterClass.InnerClass1 {

      //ВАРИАНТ1
//    public AnotherClass2 (OuterClass obj5) {
//        obj5.super();
//    }

      //ВАРИАНТ2
      public AnotherClass2 (){
           new OuterClass().super();
      }
}
