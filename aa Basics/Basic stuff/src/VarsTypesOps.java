public class VarsTypesOps {
                  // Variable types, math ops, compare ops, \n, unicode symbols typing
    public static void main (String[] args) {
        int $_num = 5631; //допустимые символы в имени переменной
        int num0; //ОБЪЯВЛЕНИЕ П-й
        int num1 = 20, num2 = 10, num3 = 4, num4 = 6; //ОБЪЯВЛЕНИЕ с ИНИЦИАЛИЗАЦИЕЙ
        System.out.println("Num1 = "+num1+"; Num2 = "+num2+"; Num3 = "+num3+"; Num4 = "+num4+";");
        int num11 = 0xB;     //hexadecimal 11
        int num8 = 010;      //octal 8
        int num13 = 0b1101;  //binary 13

        //integers:
        byte numbyte = 100; // 8bit [-128;127]
        short numshrt = 131; // 16bit [-32768;32767]
        int numint = 140; // 32bit [-2147483648;2147483647]
        long numlng = 100000; // 64bit [-9223372036854775808;9223372036854775807]
        System.out.println ("numbyte 100 + numshrt 131 = " + (numbyte+numshrt));
        System.out.println ("numint 140 + numlng 100000 = " + (numint+numlng));

        // дробные
        float numflot1 = 1.1f; //32bit, "f" req. for data type confirmation, 6-7 digits after point
        float numflot2 = 2.223456789f;
        double numdbl = 1.123; //64bit, "d" not necessary, 15 digits after point
        System.out.println ("numbyte 100 + numflot1 1.1 = " + (numbyte+numflot1));
        System.out.println("numflot2 is "+numflot2);
        System.out.printf("numflot2 with 3 digits after point is %.3f \n", numflot2);

        int result2 = num2 / num3; // целочисл деление
        System.out.println("int Num2 " + num2 + " / int Num3 " + num3 + " = " + result2 + "; (int-результат)");

        float result3 = num2 / num3;    // ?????????
        System.out.println("int Num2 " + num2 + " / int Num3 " + num3 + " = " + result3 + "; (float-результат)");

        float result4 = numflot2 / numflot1;
        System.out.println("float numflot2 " + numflot2 + " / float numflot1 " + numflot1 + " = " + result4 + "; (float-результат)");

        int result5 = num2 % num3; //остаток от деления
        System.out.println("Остаток от деления " + num2 + " на " + num3 + " = " + result5 + "; (int-результат)");

        System.out.println("======================================");
        System.out.println("Num2 = 10. Положение инкремента"); // положение инкремента имеет значение!
        int incrNum2a = num2++;
        System.out.println("num2++ = " + incrNum2a);
        num2 = 10;
        int incrNum2b = ++num2;
        System.out.println("++num2 = " + incrNum2b);
        System.out.println("======================================");

        if (num2 != num3) {                          // also == >= <=
            System.out.println("num2 не равно num3!");
        }
        if (num1 > num2 && num3 < num4) {            //логическое И
            System.out.println("Оба условия соблюдены");
        }
        if (num1 == num2 || num3 < num4) {           //логическое ИЛИ
            System.out.println("Одно из условий соблюдено");
        }
        System.out.println("======================================");

        //        !!!примитивные типы данных - с мал. буквы. Ссылочные (классы) - с большой!!!
        //String
        String Str1 = "Строка1";
        String Str2 = "Строка2";
        System.out.println("Str1 + Str2 = " + Str1 + Str2); //строки этот метод конкатенирует
        System.out.println("HELL\nof a\nWORLD"); //перенос каретки на след. строку
        System.out.println("======================================");

        //symbol CHAR. Символы имеют ПОСЛЕДОВАТЕЛЬНЫЕ ЦЕЛОЧИСЛЕННЫЕ ЗНАЧЕНИЯ
        char sym1 = '\u2122';          // TM symbol thru unicode, 16 bit, "u" small only
        System.out.println(sym1);
        char sym2 = 102;            //sym2=sym3=sym4
        char sym3 = 'f';
        char sym4 = '\u0066';
        char sym5 = 34, sym6 = 47, sym7 = 92;   //символы " / \
        System.out.println(sym2+sym3+sym4); // = 306
        System.out.println('\u0022');       //символ "
        System.out.println('\u002F');       //символ /

        //boolean
        boolean BVar = false;          // 1bit
        System.out.println(BVar);

        //Constant
        final float pi = 3.14f;        // константа. "final" - модификатор.
        System.out.println("pi+2 = " + (pi+2));
        //pi=1251                      - компилятор не пропустит такое изменение константы
    }
}
