import java.text.DecimalFormat;
import java.util.Date;
import java.util.Formatter;

public class Formatting {
    public static void main(String[] args) {
        String str1 = String.format("Мальчику %s %d лет", "Васе", 5);       // 1 way
        System.out.println(str1);
        System.out.format("Девочке %S %d лет", "Маше", 5);                  // 2 way
        System.out.print("\n");
        System.out.printf("Девочке %s %d лет", "Маше", 5);                  // 3 way
        System.out.print("\n");
        Formatter f1 = new Formatter();                                     // 4 way
        f1.format("Девочке %s %d лет", "Маше", 5);
        System.out.println(f1);

        //     СПЕЦИФИКАТОРЫ
        float fl1 = 2.1f;
        System.out.printf("float -> HEX: %a %n", fl1);               // %a - float into HEX, %n - новая строка
        boolean boo1 = true;
        System.out.printf("Boolean: %10b %n", boo1);
        char ch1 = 'z';
        System.out.printf("Char z: %c %n", ch1);
        byte dig1 = 127;
        System.out.printf("Digit: %d %n", dig1);                   // %d - целые int, byte, short, int, long, BigInteger
        double db1 = 1234.321123;
        System.out.printf("Exponential: %e %n", db1);              // %e - float в экспоненциальную запись
        System.out.printf("Fl. point number: %f %n", db1);         // %f - DEC float
        System.out.printf("Auto shortest E or F: %g %n", db1);
        String StrA = "a";
        System.out.printf("Hashcode of an argument: %h %n", StrA); // %h - HEX hashcode
        int int1 = 9;
        System.out.printf("Integer 9 -> OCTal: %o %n", int1);      // %o - Integers -> OCT
        System.out.printf("Сегодня %tA %n",new Date());            // %t - префикс для Date-Time
        int int2 = 17;
        System.out.printf("Integers -> HEX: %x %n", int2);         // %x - целое в HEX
        //%x и %h отличаются

        //       ИНСТРУКЦИИ СПЕЦИФИКАТОРОВ   %[индекс аргумента][флаги][ширина][.точность]спецификатор
        System.out.printf("Name's %2$s, I'm %4$+d years old %n", "Mary", "Alex", 5, 30);
        float salary = 1234567.123456789f;
        System.out.printf("Salary is: %+,016.3f %n", salary);   // флаги: + - ,
        short sh1=123;
        System.out.printf("Extended short digit: %+10d %n", sh1);  //ширина - DEC с нулём перед ним или без него
        System.out.printf("Extended short digit: %+010d %n", sh1); //если ставим 0<ширина>, то "-" перед этим не поставить

        // ФОРМАТИРОВАНИЕ ЧИСЕЛ через DECIMALFORMAT
        System.out.println("DecimalFormat ======================");
        float fl2 = 123456.987654f;
        DecimalFormat df1 = new DecimalFormat("#.###");
        System.out.println("#.###: " + df1.format(fl2));
        df1.applyPattern("00000000.0000");
        System.out.println("00000000.0000: " + df1.format(fl2));
        df1.applyPattern("###,###.00");
        System.out.println("###,###.00: " + df1.format(fl2));
        df1.applyPattern("0.00E0");
        System.out.println("0.00E0: " + df1.format(fl2));
        df1.applyPattern("'$' #.##");
        System.out.println("'$' #.##: " + df1.format(fl2));
        df1.applyPattern("''0.0''");
        System.out.println("''0.0'': " + df1.format(fl2));
        float fl3 = 6.3f;
        df1.applyPattern("000.000");
        System.out.println("000.000: "+df1.format(fl3));

        float fl4 = 1.356f;
        df1.applyPattern("%#.##");                                              //*100 = проценты
        System.out.println("0.356 %#.##: " + df1.format(fl4));
        df1.applyPattern("\u2030#.###");                                        //*1000 = промилле
        System.out.println("0.356 \u2030#.###: " + df1.format(fl4));

        float fl5 = 9.000123f;                                              //разница String и DecimalFormat
        System.out.println("String.format: "+String.format("%.3f",fl5));
        df1.applyPattern("#.###");
        System.out.println("DecimalFormat: "+df1.format(fl5));

        //                          DATE TIME
        Date dt1 = new Date();      // К. Date хранит дату в миллисекундах, которые прошли с 1 января 1970 года
        System.out.printf("Сегодня %td %tB %tY года %tH:%tM:%tS %n", dt1,dt1,dt1,dt1,dt1,dt1);   //результаты одинаковы
        System.out.printf("Сегодня %1$td %1$tB %1$tY года %1$tH:%1$tM:%1$tS %n",dt1);

        Date dt2 = new Date(123123123123123L);      //ms since 1 января 1970 года
        System.out.println(dt2);

        Date dt3 = new Date();
        System.out.printf("%tc",dt3);

    }
}
