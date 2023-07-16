public class PasswordChecker {

   private int minLength;
   private int maxRepeats;
   private boolean isLengthSet = false;
   private boolean areRepeatsSet = false;

   public void setMinLength(int minLength) {
      if (minLength <= 0) {
         throw new IllegalArgumentException("ОШИБКА: Пароль должен содержать хотя бы один символ!");
      } else {
         isLengthSet = true;
         this.minLength = minLength;
      }
   }

   public void setMaxRepeats(int maxRepeats) {
      if (maxRepeats <= 0) {
         throw new IllegalArgumentException("ОШИБКА: Допустимое число повторений должно быть положительным!");
      } else {
         this.maxRepeats = maxRepeats;
         areRepeatsSet = true;
      }
   }

   public boolean areSettersOK() {
      if ((!isLengthSet) || (!areRepeatsSet)) {
         throw new IllegalStateException("ОШИБКА: Оба параметра безопасности пароля должны быть заданы!");
      }
      return true;
   }

   public boolean verify(String password) {
      if (isLengthOK(password) && areRepeatsOK(password)) {
         return true;
      }
      return false;
   }

   public boolean isLengthOK(String password) {
      if (password.length() >= minLength) {
         return true;
      } else {
         System.out.println("ОШИБКА: пароль слишком короткий!");
         return false;
      }
   }

   public boolean areRepeatsOK(String password) {
      char[] chars = password.toCharArray();
      int count = 1;

      for (int i = 1; i < chars.length; i++) {

         if (chars[i] == chars[i - 1]) {
            count++;

            if (count > maxRepeats) {
               System.out.println("ОШИБКА: слишком много повторов символа \"" + chars[i] + "\"!");
               return false;
            }

         } else {
            count = 1;
         }

      }
      return true;
   }

}//end of class