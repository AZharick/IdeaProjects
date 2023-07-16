import java.text.DecimalFormat;

public class MAIN {
    public static void main(String[] args) {
        byte b, x=3, y=4;
        int a, z=5;
        a = x+y+z;         // расширяющая конв.-я  byte->int
        //b = z+x;         // сужающая конв.-я int->byte, ОШИБКА: возможна потеря данных
        b = (byte) a;      // правильная сужающая конвертация int->byte (возможна потеря данных)

        int c = 200;
        b = (byte) c;           // 200 выходит за пределы byte
        System.out.println(b);  //-56

        float fl = 45.99f;
        int d = (int) fl;       //45, тупо отсекается всё после запятой
        int e = Math.round(fl); //46

                                //   КОНВЕРТАЦИЯ
        System.out.println("\n"+"● float -> String  ====================");
        float fl1 = 11.123456f;
        System.out.println("fl1 = " + fl1);
        System.out.println("Float.toString: " + Float.toString(fl1));         //6 способов, кроме Boolean (5)
        System.out.println("String.valueOf: " + String.valueOf(fl1));
        System.out.println("String.format: " + String.format("%.2f", fl1));
        System.out.printf ("<sout>printf: " + "%.2f", fl1);                  //конв-я + вывод c форматированием
        System.out.format("\n"+"<sout>format: " + "%.2f", fl1);              //то же, что строкой выше
        DecimalFormat ForFl = new DecimalFormat("#.####");             // #.### - шаблон для любых типов чисел
        System.out.println("\n"+"DecimalFormat: "+ForFl.format(fl1));

        System.out.println("\n"+"● double -> String  ====================");
        double db1 = 22.123456;
        System.out.println("db1 = " + db1);
        System.out.println("Double.toString: " + Double.toString(db1));
        System.out.println("String.valueOf: " + String.valueOf(db1));
        System.out.println("String.format: " + String.format("%.3f", db1));
        System.out.printf ("<sout>printf: " + "%.3f", db1);
        System.out.format("\n"+"<sout>format: " + "%.3f", db1);
        DecimalFormat ForDb = new DecimalFormat("#.####");
        System.out.println("\n"+"DecimalFormat: "+ForDb.format(db1));

        System.out.println("\n"+"● byte -> String  ====================");
        byte bt1 = 127;
        System.out.println("bt1 = "+bt1);
        System.out.println("Byte.toString: "+Byte.toString(bt1));
        System.out.println("String.valueOf: " + String.valueOf(bt1));
        System.out.println("String.format: " + String.format("%d", bt1));
        System.out.printf ("<sout>printf: " + "%d", bt1);
        System.out.format("\n"+"<sout>format: " + "%d", bt1);
        DecimalFormat ForBt = new DecimalFormat("#.####");
        System.out.println("\n"+"DecimalFormat: "+ForBt.format(bt1));

        System.out.println("\n"+"● short -> String  ====================");
        short sh1 = 32767;
        System.out.println("sh1 = "+sh1);
        System.out.println("Short.toString: "+Short.toString(sh1));
        System.out.println("String.valueOf: " + String.valueOf(sh1));
        System.out.println("String.format: " + String.format("%d", sh1));
        System.out.printf ("<sout>printf: " + "%d", sh1);
        System.out.format("\n"+"<sout>format: " + "%d", sh1);
        DecimalFormat ForSh = new DecimalFormat("#.####");
        System.out.println("\n"+"DecimalFormat: "+ForSh.format(sh1));

        System.out.println("\n"+"● int -> String  ====================");
        int int1 = 123123;
        System.out.println("int1 = "+int1);
        System.out.println("Integer.toString: "+Integer.toString(int1));
        System.out.println("String.valueOf: " + String.valueOf(int1));
        System.out.println("String.format: " + String.format("%d", int1));
        System.out.printf ("<sout>printf: " + "%d", int1);
        System.out.format("\n"+"<sout>format: " + "%d", int1);
        DecimalFormat ForInt = new DecimalFormat("#.####");
        System.out.println("\n"+"DecimalFormat: "+ForInt.format(int1));

        System.out.println("\n"+"● long -> String  ====================");
        long ln1 = 987654321;
        System.out.println("ln1 = "+ln1);
        System.out.println("Long.toString: "+Long.toString(ln1));
        System.out.println("String.valueOf: " + String.valueOf(ln1));
        System.out.println("String.format: " + String.format("%d", ln1));
        System.out.printf ("<sout>printf: " + "%d", ln1);
        System.out.format("\n"+"<sout>format: " + "%d", ln1);
        DecimalFormat ForLn = new DecimalFormat("#.####");
        System.out.println("\n"+"DecimalFormat: "+ForLn.format(ln1));

        System.out.println("\n"+"● Boolean -> String  ====================");
        Boolean boo1 = false;
        System.out.println("boo1 = "+boo1);
        System.out.println("Boolean.toString: "+Boolean.toString(boo1));
        System.out.println("String.valueOf: " + String.valueOf(boo1));
        System.out.println("String.format: " + String.format("%b", boo1));
        System.out.printf ("<sout>printf: " + "%b", boo1);
        System.out.format("\n"+"<sout>format: " + "%b", boo1);
        //DecimalFormat с Boolean не работает
        System.out.print("\n");

        System.out.println("\n"+"● Char -> String  ====================");
        char ch1 = 'Z';
        System.out.println("ch1 = "+ch1);
        System.out.println("Character.toString: "+Character.toString(ch1));
        System.out.println("String.valueOf: " + String.valueOf(ch1));
        System.out.println("String.format: " + String.format("%c", ch1));
        System.out.printf ("<sout>printf: " + "%c", ch1);
        System.out.format("\n"+"<sout>format: " + "%c", ch1);
        DecimalFormat ForCh = new DecimalFormat("#.####");
        System.out.println("\n"+"DecimalFormat: "+ForCh.format(ch1));
        System.out.print("\n");

        System.out.println("\n"+"● String -> digits/Boolean =============");
        String xStr = "127";
        String yStr = "true";
        byte bt2 = Byte.parseByte(xStr);            //1 only way
        short sh2 = Short.parseShort(xStr);
        int int2 = Integer.parseInt(xStr);
        long ln2 = Long.parseLong(xStr);
        float fl2 = Float.parseFloat(xStr);
        double db2 = Double.parseDouble(xStr);
        Boolean boo2 = Boolean.parseBoolean(yStr);
        System.out.println("bt2 = "+bt2);
        System.out.println("sh2 = "+sh2);
        System.out.println("int2 = "+int2);
        System.out.println("ln2 = "+ln2);
        System.out.println("fl2 = "+fl2);
        System.out.println("db2 = "+db2);
        System.out.println("boo2 = "+boo2);

        System.out.println("\n"+"● String -> Char ======================");
        String x1Str = "M";
        String y1Str = "Ultra";
        char ch3 = x1Str.charAt(0);                 //1 way
        System.out.println("ch3 = " + ch3);
        char[] ch3mx = y1Str.toCharArray();         //2 way
        System.out.println(ch3mx);
     }
}
