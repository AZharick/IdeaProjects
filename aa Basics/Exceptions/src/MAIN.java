public class MAIN {
    //try, catch, finally, throws
    //конструкции try{}catch, try{}catch{}finally, try{}finally{}
    //try – определяет блок кода, в котором может произойти исключение
    //catch – опр. блок кода, в котором происходит обработка исключения
    //finally – опр. блок кода, кот. явл. необяз., но при его нал-и вып-ся anyway независимо от резул-в вып-я блока try
    //throw – используется для возбуждения исключения
    //throws – используется в сигнатуре методов для предупреждения, о том что метод может выбросить исключение

    public static void main(String[] args) {
        int MX1[] = {1,2,3,4,5};
        int MX2[] = new int[4];

        try {
            System.out.println("Beginning...");  // this part executes anyway
            MX2[5] = 123;                        //ERROR happens here!
        }
        //если в блоке try ошибок нет, то блоки catch НЕ выполняются и прога продолжает работу
        catch (ArrayIndexOutOfBoundsException MyException) {     //тип ошибки и ее название
            System.out.println("ERROR: Array out of bounds!");
        }
        catch (ArithmeticException MyException2) {               //можно ловить несколько типов ошибок сразу
            System.out.println("ERROR: Math error!");
        }
        finally {                                                //выполняется даже при наличии ошибкок
            System.out.println("Я хз, были ли там до меня ошибки, но это сообщение я все равно напишу!");
        }

    }
}
