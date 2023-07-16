public class MAIN {
    public static void main(String[] args) {
        String s1 = "123123";
        String s2 = "qweasd";      // RunTime error if parsed
        String s3 = "123asd";      // RunTime error if parsed

        int i1 = Integer.parseInt(s1);

        System.out.println(i1);
        System.out.println(i1+999999999);   //check if i1 is really an integer

        System.out.println(Integer.parseInt("666")+9999999);    //check if 666 is really an integer
        System.out.print("\n");

        Integer i2 = 888;
        System.out.println("i2 = " + i2);
        System.out.println("i2.byteValue() = " + i2.byteValue());                     // 120
        System.out.println("i2.floatValue() = " + i2.floatValue());                   // 888.0
        System.out.println("i2.compareTo(25) = " + i2.compareTo(25));                 // 888 <> 25 = 1
        System.out.println("i2.compareTo i1 (123123) = " + i2.compareTo(i1));         // 888 <> 123123 = -1
        System.out.println("i2.compareTo(i2) = " + i2.compareTo(i2));                 // 888 <> 888 = 0
        System.out.println("i2.hashCode() = " + i2.hashCode());                       // 888
        Integer i3 = 888;
        System.out.println("i2(888) equals i3(888): " + i2.equals(i3));               // true - ЛЮБОПЫТНЫЙ МОМЕНТ

        System.out.println("\nWRAPPER STATIC FIELDS ======================");
        System.out.println("BYTES: " + Integer.BYTES);
        System.out.println("SIZE: " + Integer.SIZE);
        System.out.println("TYPE: " + Integer.TYPE);
        System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);
    }
}
