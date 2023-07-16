public class MAIN {
    public static void main(String[] args) {
        Integer i1 = new Integer(111);
        Integer i2 = 888;

        System.out.println("7 toBinaryString = " + Integer.toBinaryString(7));     // 111
        System.out.println("MAX 9 or 10 = " + Integer.max(9,10));               // 10
        System.out.println("MIN 9 or 10 = " + Integer.min(9,10));               // 9
        System.out.println("Number of bits in 888: " + Integer.bitCount(i2));         // 6
        System.out.println("Number of bits in 255: " + Integer.bitCount(255));      // 8 ибо 1111'1111
        System.out.println("Number of bits in 256: " + Integer.bitCount(256));      // 1 ибо 1'000'000
        System.out.println("Number of bits in 16: " + Integer.bitCount(16));        // 1 ибо 1'000
        System.out.println("Compared 90 and 91: " + Integer.compare(90,91));           // -1
        System.out.println("Compared 91 and 90: " + Integer.compare(91, 90));          // 1
        System.out.println("Decoding 0xAA = " + Integer.decode("0xAA"));               // 170
        System.out.println("Signum(9) = " + Integer.signum(9));                     // 1 знак числа (-1/0/1)
        System.out.println("Sum of 123 and 7 = " + Integer.sum(123,7));         //130
        System.out.println("15657 to HEX String: " + Integer.toHexString(15657));   // 3d29
    }
}
