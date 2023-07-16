public class MAIN {

    static int a = 5;                  //ОПРЕДЕЛЁННАЯ
    static int c;                      //ОБЪЯВЛЕННАЯ

    public static int incrC () {
        return ++c;
    }

    public static int incrA () {
        int b;                   // переменная, ОПРЕДЕЛЁННАЯ или ОБЪЯВЛЕННАЯ в одном методе, другим методом не обнаруживается
        return ++a;
    }

    public static int decrD () {
      //System.out.println(b);
        return --d;
    }



    public static void main(String[] args) {
        System.out.println("Initial A is: "+a);
        System.out.println("Initial C is: "+c);
        System.out.println("Initial D is: "+d);
        System.out.println("IncrA: "+MAIN.incrA());
        System.out.println("DecrD: "+MAIN.decrD());
        System.out.println("DecrD: "+MAIN.decrD());
        System.out.println("IncrC: "+MAIN.incrC());
        }

    static int d = 8;
    }

