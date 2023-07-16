/**Дан массив [1, 2, 3], и массив весов [1, 2, 10].
 В среднем, значение «1» должно возвращаться в 2 раза реже,
 чем значение «2» и в десять раз реже, чем значение «3».
 */
public class RandomPossibility {
   private int[] values;
   private int[] psblty;

   public static void main(String[] args) {
      int[] arr1 = {1,2,3};
      int[] arr2 = {1,2,10};

      RandomPossibility obj = new RandomPossibility(arr1, arr2);
      for (int i = 0; i < 30; i++) {
         System.out.print(obj.generateRandom() + "-");
      }

   }

   public RandomPossibility (int[] values, int[] psblty) {
       this.values = values;
       this.psblty = psblty;
   }

   //[1, 2, 3]   [1, 2, 10]     [1][2,3][4,5,6,7,8,9,10]
   public int generateRandom() {
      int totalPsblty = 0;
      for (int i:psblty) {
         totalPsblty += i;
      }

      int psblty = randomInt(1,totalPsblty);

      if (psblty>this.psblty[1]+1) {
         return values[2];
      } else if (psblty<this.psblty[1]) {
         return values[0];
      } else return values[1];
   }

   public static int randomInt(int min, int max) {
      return (int) ((Math.random() * (max - min)) + min);
   }


}
