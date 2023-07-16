public class Main {
   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_BLACK = "\u001B[30m";
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_GREEN = "\u001B[32m";
   public static final String ANSI_YELLOW = "\u001B[33m";
   public static final String ANSI_BLUE = "\u001B[34m";
   public static final String ANSI_PURPLE = "\u001B[35m";
   public static final String ANSI_CYAN = "\u001B[36m";
   public static final String ANSI_WHITE = "\u001B[37m";

   public static void main(String[] args) {
//    writeWithRandomColors("Funny letters! =)", true, true, true);
//    displayUpperCaseLetters();
//    displayLowerCaseLetters();
//    displayUpperCaseCyrillic();
//    displayLowerCaseCyrillic();
//    writeInDoubleFrame("I love Java!");
//    writeInDoubleFrame("Today is a very lucky day. I had a great supper!");
//    displayAllChars();
   }

   public static void writeWithRandomColors(String s, boolean isFontColored, boolean isBold, boolean isBackColored) {
      String[] colorBold = {"\u001B[30;1m", "\u001B[31;1m", "\u001B[32;1m", "\u001B[33;1m",
                        "\u001B[34;1m", "\u001B[35;1m", "\u001B[36;1m", "\u001B[37;1m"};
      String[] color = {"\u001B[30m", "\u001B[31m", "\u001B[32m", "\u001B[33m",
              "\u001B[34m", "\u001B[35m", "\u001B[36m", "\u001B[37m"};
      String[] backColor = {"\u001b[40m", "\u001b[41m", "\u001b[42m", "\u001b[43m",	"\u001b[44m",
      	                    "\u001b[45m", "\u001b[46m",	"\u001b[47m"};
      String reset = "\u001B[0m";

      int l = s.length();
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < l; i++) {
         int random1 = (int) (Math.random()*7);
         int random2 = (int) (Math.random()*7);
         String result;
         String font = "";
         String bold = "";
         String back = "";

         if(isFontColored) {
            if(isBold) {
               bold = colorBold[random1];
            }
            else {
               font = color[random1];
            }
         }
         if(isBackColored) {
            back = backColor[random2];
         }

         result = back+font+bold+s.charAt(i)+reset;
         sb.append(result);
      }
      System.out.println(sb);
   }

   public static void displayAllChars() {
      char ch = 0;
      int count = 0;
      for (int i = 0; i < 65534; i++) {
         System.out.print(ch++);
         count++;
         if (count == 228) {
            System.out.println();
            count = 0;
         }
      }
   }
   public static void displayUpperCaseLetters() {
      System.out.print("65-90: ");
      char ch = 65;
      for (int i = 65; i < 91; i++) {
         System.out.print(ch++);
      }
      System.out.println();
   }
   public static void displayLowerCaseLetters() {
      System.out.print("97-122: ");
      char ch = 97;
      for (int i = 97; i < 123; i++) {
         System.out.print(ch++);
      }
      System.out.println();
   }
   public static void displayUpperCaseCyrillic() {
      System.out.print("1040-1071: ");
      char ch = 1040;
      for (int i = 1040; i < 1072; i++) {
         System.out.print(ch++);
      }
      System.out.println();
   }
   public static void displayLowerCaseCyrillic() {
      System.out.print("1072-1103: ");
      char ch = 1072;
      for (int i = 1072; i < 1104; i++) {
         System.out.print(ch++);
      }
      System.out.println();
   }
   public static void writeInDoubleFrame(String s) {
      System.out.print("\u2554\u2550");

      for (int i = 0; i < s.length(); i++) {
         System.out.print("\u2550");
      }

      System.out.print("\u2550\u2557\n" +
              "\u2551\u0020" + s + "\u0020\u2551\n" +
              "\u255A\u2550");

      for (int i = 0; i < s.length(); i++) {
         System.out.print("\u2550");
      }

      System.out.print("\u2550\u255D\n");
   }

}//end of Main
