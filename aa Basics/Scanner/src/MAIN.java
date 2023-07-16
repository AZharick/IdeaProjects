import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scnr first = new Scnr();
        first.single();

//        asd second = new asd();
//        second.crashDemo();

        System.out.println("next(): String, single word scan =============");
        String str0 = " first second third";
        Scanner scan0 = new Scanner(str0);
        System.out.println(scan0.next()+"\n");
        scan0.close();

        System.out.println("nextLine(): whole String scan till new line ===============");
        String str1 = "1 one 2 two 3 three";
        Scanner scan1 = new Scanner(str1);
        System.out.println(scan1.nextLine());
        scan1.close();

        String poem = "Первая строка поэмы\nВторая строка поэмы\nТретья строка поэмы \n";
        Scanner scanPoem = new Scanner(poem);
        System.out.println(scanPoem.nextLine());
        System.out.println(scanPoem.nextLine());
        System.out.println(scanPoem.nextLine()+"\n");
        scanPoem.close();

        System.out.println("nextInt(): Integer scan ======================");
        String str2 = "12 two2 three3";
        //String str2 = "one1 two2 three3";      - input mismatch
        //String str2 = "one 1 two2 three3";     - input mismatch
        Scanner scan2a = new Scanner(str2);
        System.out.println("Из строки: "+scan2a.nextInt());
        scan2a.close();

        int int1 = 123;
        Scanner scan2b = new Scanner(String.valueOf(int1)); //напрямую из int, по ходу не читает, К-р отсутствует
        System.out.println("Из строки, сконвертированной из int:");
        System.out.println(scan2b.nextInt()+"\n");              //необх. конв-я в String
        scan2b.close();

        System.out.println("nextFloat(): Float scan ======================");
        // ПРИ ВВОДЕ FLOAT ДОЛЖЕН БЫТЬ ЧЕРЕЗ ЗАПЯТУЮ!
        String str3 = "1,2";
        //String str3 = "1,2 two2 three3";            - WORKS, 1.2
        //String str3 = "1,2f";                       - input mismatch
        //String str3 = "one 1,2f two2 three3";       - input mismatch
        //String str3 = "one 1,2 two2 three3";        - input mismatch
        Scanner scan3a = new Scanner(str3);
        System.out.println(scan3a.nextFloat());
        scan3a.close();

        Scanner scan3b = new Scanner(System.in);
        System.out.println("Enter a float number (THRU COMMA!):");
        float fl1 = scan3b.nextFloat();
        System.out.println(fl1+"\n");

        //hasNext()
        System.out.println("hasNext() =====================================");
        Scnr.next("");                   // FALSE
        Scnr.next("asd");                // TRUE
        Scnr.next("asd zxc");            // TRUE
        System.out.print("\n");

        System.out.println("Цикл чтения цепочки токенов hasNext:");
        String str4 = "1 2 3 4 5 6 7 8 9 10";
        Scanner scan4 = new Scanner(str4);
        while (scan4.hasNext())
        {
            System.out.print(scan4.next()+" ");
        }
        scan4.close();
        System.out.print("\n");

        //hasNext(String qwe)
        System.out.println("hasNext (String) ===============================");
        Scnr.word2("qwe");                 // TRUE
        Scnr.word2("qwer oihs [paso");     // FALSE
        Scnr.word2("asd qwe oihs [paso");  // FALSE
        System.out.print("\n");

        //hasNextLine(String)
        System.out.println("hasNextLine (String) ===============================");
        Scnr.word3("one 123");             // TRUE
        Scnr.word3("123 one");             // TRUE

        Scanner scan5a = new Scanner("123");
        System.out.println("123:"+scan5a.hasNextLine());   // TRUE
        scan5a.close();
        Scanner scan5b = new Scanner("asd");
        System.out.println("asd:"+scan5b.hasNextLine());   // TRUE
        scan5b.close();

        System.out.print("\n");

        //hasNextInt - Returns true if the next token in this scanner's input can be interpreted as an int value
        //in the default radix using the nextInt() method.
        System.out.println("hasNextInt (int) ===============================");
        Scanner scan6a = new Scanner(String.valueOf(123));
        System.out.println("String.valueOf(123): "+scan6a.hasNextInt());   // TRUE
        scan6a.close();

        Scanner scan6b = new Scanner("123");
        System.out.println("\"123\": "+scan6b.hasNextInt());               // TRUE
        scan6b.close();

        Scanner scan6c = new Scanner("asdasf");
        System.out.println("\"asdasf\": "+scan6c.hasNextInt());            // FALSE
        scan6c.close();
        System.out.print("\n");

        //Delimiter
        System.out.println("Delimiter \"бля\": ============================");
        String dirty = "1.2.3.4.5";
        Scanner dirt = new Scanner(dirty);
        dirt.useDelimiter("\\.");
        while (dirt.hasNext()) {
            System.out.print(dirt.next()+" ");
        }
        dirt.close();
    }
}
