import java.util.Scanner;
public class Scnr {
    public void single () {                        //одиночный сканер закрывается успешно
        System.out.println("Enter an integer:");   // при попытке исп.-я М-да С-ра после закрытого ВЫЛЕТАЕТ .NoSuchElementException
        Scanner scan1 = new Scanner(System.in);
        int num1 = scan1.nextInt();
        System.out.println("num1 = "+num1);
        //scan1.close();                         на stackoverflow советуют не закрывать сканер, привязанный к System.in
        System.out.println("single scanner closed"+"\n");
    }

//    public void crashDemo () {
//        System.out.println("Enter an integer:");
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("new scanner created");
//        int num2 = scan2.nextInt();                // краш на этой строке, по ходу
//        System.out.println("requested an int");
//        System.out.println("num4 = "+num2);
//        scan2.close();
//    }

    //hasNext() - Returns true if this scanner has another token in its input
    public static void next (String s1) {
        Scanner scan3 = new Scanner(s1);
        if (scan3.hasNext()) {
            System.out.println("This string has another token in its input!");
        }
        else {System.out.println("There's nothing else in this input...");}
        scan3.close();
    }

    //hasNext(String Pattern) - Returns true if the next token matches the pattern constructed from the specified string
    public static void word2 (String s2) {
        Scanner scan4 = new Scanner(s2);
        if (scan4.hasNext("qwe")) {
            System.out.println("This string has a \"qwe\" in the next token!");
        }
        else {System.out.println("Next token doesn't match the string you've entered...");}
        scan4.close();
    }

    //hasNextLine() - Returns true if there is another line in the input of this scanner.
    public static void word3 (String s3) {
        Scanner scan5 = new Scanner(s3);
        if (scan5.hasNextLine()) {
            System.out.println("There is another line in the input of this scanner!");
        } else {
            System.out.println("Next token isn't a line...");
        }
        scan5.close();
    }

    //hasNextInt() - Returns true if the next token in this scanner's input can be interpreted as an int value
    // in the default radix using the nextInt() method.


}
