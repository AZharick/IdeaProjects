/** Здесь три Класса - три способа:
 *  1) Обычный: интерфейс, класс, объект, метод
 *  2) Анон К-с, реализующий функциональный И-с
 *  3) Лямбда
 */

//1-й способ
public class Main {

   public static void main(String[] args) {

      Sum sum = new Sum(); //этот О-т создается только для реал-и одного М-да, он излишен
      System.out.println(sum.sum(2,3));

   }

}

interface ISum {
   int sum (int a, int b);
}

class Sum implements ISum{   //этот К-с создается только для реал-и одного М-да, он излишен
   @Override
   public int sum(int a, int b) {
      return a+b;
   }
}