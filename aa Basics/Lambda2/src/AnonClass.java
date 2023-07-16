//2-й способ
public class AnonClass {

   public static void main(String[] args) {

      ISum2 summer = new ISum2() {   //О-т summer анон. К-са, реал-го ISum
         @Override
         public int sum(int a, int b) {
            return a+b;
         }
      };

      System.out.println(summer.sum(2,3));

   }

}

interface ISum2 {
   int sum (int a, int b);
}