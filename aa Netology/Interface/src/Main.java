public class Main {

   public static void main(String[] args) {
      SimpleLogger simpleLogger1 = new SimpleLogger();
      simpleLogger1.log("First simple call");

      System.out.println("====================");

      SmartLogger smartLogger = new SmartLogger();
      smartLogger.log("First smart call");
      smartLogger.log("Second smart call");
      smartLogger.log("Third smart call with error");
      smartLogger.log("Fourth smart call with ERROR");

   }//end of psvm

}//end of Main
