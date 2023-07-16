public class ExamClouds {
   public static void main(String[] args) {

      GenTriple<String,Integer,Double> genTriple = new GenTriple<>("Hello", 23, 3.14D);
      System.out.println("T: "+ genTriple.getT());
      System.out.println("V: "+ genTriple.getV());
      System.out.println("K: "+ genTriple.getK());

      genTriple.getAllTypes();

   }//end of psvm
}//end of ExamClouds

//==========================

class GenTriple <T,V,K> {
   T t; V v; K k;

   public GenTriple(T o1, V o2, K o3) {
      this.t = o1;
      this.v = o2;
      this.k = o3;
   }

   public T getT() {
      return this.t;
   }
   public V getV() {
      return this.v;
   }
   public K getK() {
      return this.k;
   }

   public void getAllTypes() {
      System.out.println("\nТип T: " + t.getClass().getName());
      System.out.println("Тип V: " + v.getClass().getName());
      System.out.println("Тип K: " + k.getClass().getName());
   }

}