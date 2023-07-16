public class Worker {

   private OnTaskDoneListener callback;
   private OnTaskErrorListener callback2;
   private static final String ANSI_RED = "\u001B[31m";
   private static final String ANSI_RESET = "\u001B[0m";

   public Worker(OnTaskDoneListener callback, OnTaskErrorListener callback2) {
      this.callback = callback;
      this.callback2 = callback2;
   }

   @FunctionalInterface
   public interface OnTaskDoneListener {
      void onDone(String result);
   }

   public interface OnTaskErrorListener {
      void onError(String errorMsg);
   }

   public void start() {
      for (int i = 0; i < 100; i++) {
         if (i != 33) {
            callback.onDone("Task " + i + " is done");
         } else {
            callback2.onError(ANSI_RED + "В задаче 33 ошибка!" + ANSI_RESET);
         }
      }
   }

}