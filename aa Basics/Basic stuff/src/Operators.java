public class Operators {
    public static void main(String[] args) {
        // +  -  *  /  %
        // += -= *= /= %=
        int a=4, b=3, c=6, d=7;
        System.out.println("a="+a+"; b="+b+"; c="+c+"; d="+d);
        System.out.println("c+=a = "+(c+=a));
        System.out.println("d%b = "+d%b);       // Остаток от деления или Деление по модулю
        // & | ^ ~
        System.out.println("3 = 011; 4 = 100; 7 = 111");
        System.out.println("3&4 = "+ (3&4));    // AND, логич. умножение, конъюнкция
        System.out.println("3|4 = "+ (3|4));    // OR, логич. сложение, дизъюнкция, || V
        System.out.println("3^4 = "+ (3^4));    // XOR, логич. исключающее ИЛИ, строгая дизъюнкция
        System.out.println("~4 = "+(~4)+"\n");       // NOT, инверсия, отрицание
        int e=5, f=6;
        System.out.println("e="+e+"; f="+f);
        System.out.println("e&=f = "+(e&=f)+"\n");               //с присваиванием

        //вывод двоичных
//        int i;
//        for (i=-10;i<=32;i++){
//            System.out.println(i+"="+Integer.toBinaryString(i));
//        }

        System.out.println("СДВИГ ВЛЕВО ========================");
        int x = 11;
        int y,z,z1;
        System.out.println("x="+x+" (BIN: "+Integer.toBinaryString(x)+")");
        y = x<<1;                               //сдвиг << умножает число на 2
        System.out.println("y = x<<1 = "+y+" (BIN: "+Integer.toBinaryString(y)+")");
        z = x<<2;
        System.out.println("z = x<<2 = "+z+" (BIN: "+Integer.toBinaryString(z)+")");
        z1 = x<<3;
        System.out.println("z1 = x<<3 = "+z1+" (BIN: "+Integer.toBinaryString(z1)+")"+"\n");

        int x1 = 12;
        int y2,z2,z3;
        System.out.println("x1="+x1+" (BIN: "+Integer.toBinaryString(x1)+")");
        y2 = x1<<1;
        System.out.println("y2 = x1<<1 = "+y2+" (BIN: "+Integer.toBinaryString(y2)+")");
        z2 = x1<<2;
        System.out.println("z2 = x1<<2 = "+z2+" (BIN: "+Integer.toBinaryString(z2)+")");
        z3 = x1<<3;
        System.out.println("z3 = x1<<3 = "+z3+" (BIN: "+Integer.toBinaryString(z3)+")"+"\n");

        System.out.println("СДВИГ ВПРАВО ========================");
        int a1 = 25;                                //сдвиг >> в среднем делит на 2, но с потерей точности
        int b1,c1,d1;
        System.out.println("a1="+a1+" (BIN: "+Integer.toBinaryString(a1)+")");
        b1=a1>>1;
        System.out.println("b1 = a1>>1 = "+b1+" (BIN: "+Integer.toBinaryString(b1)+")");
        c1=a1>>2;
        System.out.println("c1 = a1>>2 = "+c1+" (BIN: "+Integer.toBinaryString(c1)+")");
        d1=a1>>3;
        System.out.println("d1 = a1>>3 = "+d1+" (BIN: "+Integer.toBinaryString(d1)+")"+"\n");

        int a2 = 26;
        int b2,c2,d2;
        System.out.println("a2="+a2+" (BIN: "+Integer.toBinaryString(a2)+")");
        b2=a2>>1;
        System.out.println("b2 = a2>>1 = "+b2+" (BIN: "+Integer.toBinaryString(b2)+")");
        c2=a2>>2;
        System.out.println("c2 = a2>>2 = "+c2+" (BIN: "+Integer.toBinaryString(c2)+")");
        d2=a2>>3;
        System.out.println("d2 = a2>>3 = "+d2+" (BIN: "+Integer.toBinaryString(d2)+")"+"\n");

        int a3 = 28;
        int b3,c3,d3;
        System.out.println("a3="+a3+" (BIN: "+Integer.toBinaryString(a3)+")");
        b3=a3>>1;
        System.out.println("b3 = a3>>1 = "+b3+" (BIN: "+Integer.toBinaryString(b3)+")");
        c3=a3>>2;
        System.out.println("c3 = a3>>2 = "+c3+" (BIN: "+Integer.toBinaryString(c3)+")");
        d3=a3>>3;
        System.out.println("d3 = a3>>3 = "+d3+" (BIN: "+Integer.toBinaryString(d3)+")"+"\n");

        System.out.println("БЕЗЗНАКОВЫЙ СДВИГ ВПРАВО ================");
        int a4 = -10;
        int b4,c4,d4;
        System.out.println("a4 = "+a4+" (BIN: "+Integer.toBinaryString(a4)+")");
        b4=a4>>>1;
        System.out.println("b4 = a4>>>1 = "+b4+" (BIN: "+Integer.toBinaryString(b4)+")");
        c4=a4>>>2;
        System.out.println("c4 = a4>>>2 = "+c4+" (BIN: "+Integer.toBinaryString(c4)+")");
        d4=a4>>>3;
        System.out.println("d4 = a4>>>3 = "+d4+" (BIN: "+Integer.toBinaryString(d4)+")"+"\n");

        int a5 = -10;
        int b5,c5,d5;
        System.out.println("a5 = "+a5+" (BIN: "+Integer.toBinaryString(a5)+")");
        b5=a5>>1;
        System.out.println("b5 = a5>>1 = "+b5+" (BIN: "+Integer.toBinaryString(b5)+")");
        c5=a5>>2;
        System.out.println("c5 = a5>>2 = "+c5+" (BIN: "+Integer.toBinaryString(c5)+")");
        d5=a5>>3;
        System.out.println("d5 = a5>>3 = "+d5+" (BIN: "+Integer.toBinaryString(d5)+")"+"\n");

        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-1>>16));
        System.out.println(Integer.toBinaryString(-1>>>16));
    }
}
