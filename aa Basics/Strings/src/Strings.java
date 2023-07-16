import java.util.Locale;  //req. by toUpperCase,toLowerCase
//                                        STRING, StringBuilder
public class Strings {
    public static void main (String[] args) {

        String str0 = "Samsung";
        System.out.println("str0 = "+str0);
        str0 = "Sony";
        System.out.println("str0 = "+str0);
        str0 = str0.toUpperCase(Locale.ROOT);
        System.out.println("str0 = "+str0);

        String str1 = "Ultra";             //String - ссылочный тип данных
        System.out.println("str1 = "+str1);
        String str2 = new String("Two");
        System.out.println("str2 = "+str2);
        String str3 = "ultra";
        System.out.println("str3 = "+str3);
        String str4 = "Four";
        System.out.println("str4 = "+str4);

        System.out.println("\n"+"LENGTH ============================");
        System.out.println("Length of "+str1+" string is: "+str1.length());

        System.out.println("\n"+"CONCAT + JOIN ============================");
        System.out.println(str1.concat(str2).concat(str3).concat("Shit"));
        String str5 = String.join("-", str1, str2, str3, "Crap");
        System.out.println(str5);

        System.out.println("\n"+"EXTRACTING SYMBOLS ========================");
        char ch1 = str4.charAt(2);     //Извлечение символа по индексу
        System.out.println("Second indexed symbol of "+str4+" is: "+ch1);   // u symbol

        String str6 = "Extracting";    //извлечение цепочки символов и помещение их в массив
        char[] mxsyms1 = new char[3];
        str6.getChars(3,6,mxsyms1,0);
        System.out.println("Символы 3-5 слова Extracting:");
             for (char y : mxsyms1) {
                 System.out.print(y+"-");
             }

        System.out.println("\n");
        System.out.println("EXTRACTING SUBSTRINGS ========================");
        //substring возвр. подстроку
        String longer = "Hyperspacial";
        System.out.println(longer.substring(5));     // spacial
        System.out.println(longer.substring(0,5));   // Hyper
        String s1 = longer.substring(0,3);           // Hyp
        //String s2 = longer.subSequence(0, 3);        // Type mismatch compiler error
        CharSequence s3 = longer.subSequence(0, 3);    // Hyp
        CharSequence s4 = longer.substring(0, 3);      // Hyp

        System.out.println("\n"+"COMPARING: equals =================================");
        // оператор сравнения == для строк не используется, одинаковые строки могут быть не равными
        // используется метод equals

        if (str1.equals(str3)) {
            System.out.println("Строки "+str1+" и "+str3+" одинаковы с учётом регистра");
        } else System.out.println("Строки "+str1+" и "+str3+" НЕ одинаковы с учётом регистра");

        if (str1.equalsIgnoreCase(str3)) {
            System.out.println("Строки "+str1+" и "+str3+" одинаковы без учёта регистра");
        } else System.out.println("Строки "+str1+" и "+str3+" НЕ одинаковы без учёта регистра");

        System.out.println("\n"+"COMPARING: regionMatches =========================");
        String str7 = "Metallica";
        String str8 = "Nu metal";
        boolean result = str7.regionMatches(0, str8,3,5);      //форма 1
        System.out.println(result);                                               //False = "Metal" и "metal"
        result = str7.regionMatches(true,0,str8,3,5); //форма 2
        System.out.println(result);                                                //True = "Metal" и "metal"

        System.out.println("\n"+"COMPARING: compareTo =========================");
        String str9 = "A";
        String str10 = "a";
        String str11 = "B";
        String str12 = "";
        System.out.println(str9.compareTo(str10));             //A-a = -32   сравнивается порядок символов в табл. ASCII
        System.out.println(str9.compareToIgnoreCase(str10));   //A-a = 0
        System.out.println(str11.compareTo(str9));             //B-A = 1
        System.out.println(str9.compareTo(str12));             //A-"" = 1

        System.out.println("Перевод в заглавные буквы строки "+str1+": "+str1.toUpperCase(Locale.ROOT));

        System.out.println("\n"+"FINDING SUBSTRINGS: indexOf ===================");
        String str13 = "Thirteen";
        System.out.println("Нач. индекс t в слове "+str13+": "+str13.indexOf("t"));    // 4 - с учётом регистра!
        System.out.println("Индекс последнего нахождения e в слове "+str13+": "+str13.lastIndexOf("e"));
        System.out.println("Индекс (начальный) последнего нахождения teen в слове "+str13+": "+str13.lastIndexOf("teen"));
        System.out.println("Нач. индекс X в слове "+str13+": "+str13.indexOf("X"));  //-1 при ненахождении

        System.out.println("\n"+"FINDING SUBSTRINGS: startsWith/endsWith ===========");
        String str14 = "Labs' samples.mp3";
        if (str14.startsWith("Labs")) {
            System.out.println("Labs' file found!");
        }
        if (str14.endsWith("mp3")) {
            System.out.println("Sound file found!");
        }

        System.out.println("\n"+"REPLACING SUBSTRINGS: replace ====================");
        String swear = ("You motherfucker! I'll fuck your cunt you worthless piece of shit! Your crappy mother will suck my dick!");
        swear = (swear.replace("fuck", "f**k"));
        swear = (swear.replace("cunt", "c**t"));
        swear = (swear.replace("crap", "c**p"));
        swear = (swear.replace("shit", "s**t"));
        swear = (swear.replace("dick", "d**k"));
        System.out.println(swear);
        swear = (swear.replace('!', '?'));
        System.out.println(swear);

        System.out.println("\n"+"TRIMMING ============================");
        String lame = "  Yarik  Moskva  ";         //removes spaces in the beginning and in the end
        System.out.println(lame);
        System.out.println(lame.trim());

        System.out.println(lame.isEmpty());

        //StringBuilder
        StringBuilder sb1 = new StringBuilder();          // mutable, все изм-я, внесенные М-ми, применяются к исх. объекту
        StringBuilder sb2 = new StringBuilder("Builder2");
        StringBuilder sb3 = new StringBuilder("Megawave");
        System.out.println("sb2 = "+sb2);
        System.out.println("sb2 = "+sb2.append("Suffix"));
        System.out.println("sb2 reversed: "+sb2.reverse());
        System.out.println("sb2, измененный методами: "+sb2);
        System.out.println("sb3 = "+sb3);
        System.out.println(sb3.append(" + 1st element").append(" + 2nd element"));  // возможен append цепочкой
        System.out.println("================================");

        //Formatting strings
        System.out.printf("%f Formatted string with %d inserted %s", 10.23, 3, "parts");
        System.out.println("\n");
        System.out.printf("1: %10d \n", 666);
        System.out.printf("2: %10d \n", 05);
        System.out.printf("3: %10d \n", 10000);
        System.out.printf("4: %10d \n", 987987987);
        System.out.println("================================");
        System.out.printf("1: %-10d \n", 666);
        System.out.printf("2: %-10d \n", 05);
        System.out.printf("3: %-10d \n", 10000);
        System.out.printf("4: %-10d \n", 987987987);
        System.out.println("================================");
        System.out.printf("%.4f \n", 666.123456789);        //formatting floats

    }
}
