public class MAIN {

    //n-й член чисел Фибоначчи (каждый член равен сумме двух предыдущих)
    static int fib (int n){
        if (n==0){return 0;}
            else {if (n==1) {return 1;}
                else {return fib(n-1)+fib(n-2);}
        }
    }

    static int countdown (int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print(n);
            System.out.print(" ");
            return countdown(n - 1);
        }
    }

    static int factorial (int x){    //Ф. - это кол-во комбинаций IRL
        if (x==0) {
            return 1;
        }
        else if (x==1) {
             return 1;
             }
             else {
                return x*factorial(x-1);
             }
    }

    static int sum0x (int x){        //сумма от 0 до x
        if (x==0){
            return 0;
        }
        else {
            return x+sum0x(x-1);
        }
    }

    static void ABdigs (int A, int B) {
        if (A==B) {
            System.out.println(A);
        }
        else {
            System.out.print(A+" ");
            ABdigs(A+1,B);
        }
    }

    static int sumAtoB (int A, int B){
        if (B==A) {
            return A;
        }
        else {
            return A+sumAtoB(A+1,B);
        }
    }

    public static void main (String[] args) {
        System.out.println("VOID: NUMBERS FROM A TO B: ======");
        ABdigs(-3,13);
        System.out.println("\nCOUNTDOWN: ================");
        System.out.println(countdown(6));
        System.out.println("\nFACTORIAL: ================");
        System.out.println("6! = "+ factorial(6));       //720
        System.out.println("\nSUM FROM 0 TO X: ==========");
        System.out.println("Sum 0-7 is: "+sum0x(7));     //28
        System.out.println("\nSUM FROM A TO B: ==========");
        System.out.println("Sum from 3 to 6: "+sumAtoB(3,6));
    }
}
