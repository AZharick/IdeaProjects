//Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента
// массива. Массив является переменной класса. Массив должен передаваться в класс через конструктор.

class MinMax <T extends Number> implements Comparable{
   T[] obj1;

   public MinMax (T[] arr) {
      obj1 = arr;
   }

   public T findMin () {
      T minimum = obj1[0];

      for (int i = 0; i < obj1.length; i++) {
         //if (obj1[i]<minimum)
      }
      return minimum;
   }

   @Override
   public int compareTo(Object o) {
      return 0;
   }
}
   
   