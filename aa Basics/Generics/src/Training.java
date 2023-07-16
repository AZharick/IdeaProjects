public class Training {

   public static void main(String[] args) {
      GenComponents<String, Integer> genComponent = new GenComponents<>("Satan", 666);
      genComponent.writeObjs();

      System.out.println("obj1:");
      genComponent.choose(true);
      System.out.println();
      System.out.println("obj2:");
      genComponent.choose(false);

   }//end of psvm

}//end of Training

//====================================
class GenComponents <T, V> {
   T obj1;
   V obj2;

   GenComponents (T t, V v) {
      this.obj1 = t;
      this.obj2 = v;
   }

   public T writeT() {
      return obj1;
   }

   public void writeObjs() {
      System.out.println(obj1 + " " + obj2);
   }

   public <T, V> void choose (boolean flag) {
      if (flag) {
         System.out.println("obj1: "+obj1);
         System.out.println("obj1 type: "+obj1.getClass().getName());
      } else {
         System.out.println("obj2: " + obj2);
         System.out.println("obj2 type: " + obj2.getClass().getName());
      }
   }

}
