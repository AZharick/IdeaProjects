//3-й способ
public class Lambda {

   public static void main(String[] args) {

      ISum3 summer = (a, b) -> a+b;
      System.out.println(summer.sum(2, 3));
   }

}

interface ISum3 {
   int sum (int a, int b);
}