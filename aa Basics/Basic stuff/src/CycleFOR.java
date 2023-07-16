import java.io.IOException;
                        // FOR, (char) System.in.read() условие ввода символа
public class CycleFOR {
    public static void main (String[] args) throws IOException {
        int i1; //счетчик итераций МБ нужен, если нужно передать номер итерации дальше по коду, вне цикла
        int i2 = 0;
        for (int i=0; i<10; i++){
            System.out.print("a-" + i);
        }

        System.out.print("\n");

        for (int i=1; i<10; i=i+2){
            System.out.print("b-" + i);
        }

        System.out.print("\n");

        System.out.println("Итерация C, ожидается ввод символа S");
        for (int i=1; (char) System.in.read() !='S'; i++) {//пока юзер не напишет "S"
            System.out.print("c-" + i);
        }

        System.out.print("\n");

        for (i1=1; i1<10; i1++){
            System.out.print("d-" + i1);
        }
        System.out.print("номер последней итерации: " + i1); //передача по коду счетчика И-й, объявленного вне цикла

        System.out.print("\n");

        for (; i2<10;){       //неудобочтимая, но рабочая запись условий цикла
            System.out.print("e-" + i2);
            i2++;
        }

        // for (;;){ - бесконечный цикл, только экстр. прерывание
        // тело цикла }

    }
}