

public class Main {

   public static void main(String[] args) {
      Bank<Integer> bank1 = new Bank (new Integer[] {1, 2, 3, 4, 5, 6});
      Bank<String> bank2 = new Bank (new String[] {"12341", "125123", "541671"});

   }//end of psvm

}//end of Main

class Bank<T> {    //тип Т будет использоваться этим К-сом (это МБ К-с или И-с...)
   T[] clients;

   public Bank(){}
   public Bank(T[] _clients) {
      this.clients = _clients;
   }

}// end of Bank class