import java.util.Scanner;
import java.util.Arrays;
public class MyArrays {
    // ARRAYS, поле LENGTH, цикл FOR EACH
    public static void main (String[] args) {
        int[] mx1 = new int[5];           // М. из 5-ти ячеек без влож. зн-й (default 0), размерность М. не изменима
        int[] mx2 = new int[] {1,2,3,4};
        int[] mx3 = {1, 2, 3, 4};
        int mx4[] = {10, 20, 30 ,40};

        int[][] mx5 = new int [3][4];       // массив, состоящий из 2-х подмассивов
        //Candy [] box = new Candy[5];      // ссылочный тип, при созданном классе Candy

        // ДОПИСАТЬ ЭТОТ КУСОК!
        int[][] mx6 = {{2,3,4},{8,9,10,11}};
        System.out.println("mx6 = {{2,3,4},{8,9,10,11}}");
        System.out.println("mx6[0].length = "+mx6[0].length);  // 3
        System.out.println("mx6[1].length = "+mx6[1].length);  // 4
        int i1,j1;
        for (i1=0; i1<mx6[0].length-1; i1++){
            for (j1=0; j1<mx6[1].length-1; j1++){
                if ((i1==1)&(j1==3)){
                    continue;
                }
                System.out.println(mx6[i1][j1]);
            }
        }
        System.out.println("\n");


        int[][][] mx8 = new int [4][3][3];
        System.out.println("mx8.length = "+mx8.length);    //4
        System.out.println(mx8[0][0][1]+"\n");

        System.out.println("BOOLEAN-массив ===================");
        boolean [] mx9 = {true, false, false, true};
        System.out.println("mx9 length = "+mx9.length);
        System.out.println("mx9[1] = "+mx9[1]+"\n");

        System.out.println("CHAR-массив ======================");
        char[] mx6ch = new char [100];
        char a = 'a';
        for (int i=0; i<mx6ch.length; i++){
            mx6ch[i] = a;
            a++;
        }
        for (char b : mx6ch) {
            System.out.print(b+" ");
        }
        System.out.println("\n");

        System.out.print("STRING-массив =====================\n");
        String[] mx7str = new String[5];
        Scanner asd = new Scanner(System.in);
        for (int i=0; i<mx7str.length; i++) {
            System.out.println("Введи " + i + "-й элемент массива:");
            mx7str[i] = asd.next();
        }
        System.out.println("Наш STRING-массив:");      //т.н. цикл FOR EACH
        for (String stroka : mx7str) {
            System.out.print(stroka+"-");
        }
        System.out.print("\n");
        Arrays.sort(mx7str);
        System.out.println("Sorted Strings:");
        for (String ass:mx7str) {
            System.out.print(ass+"-");
        }
        System.out.print("\n");
        System.out.println("Длина STRING-массива: "+mx7str.length+" элементов\n");

        System.out.println("КОПИРОВАНИЕ МАССИВА ==========================");
        String[] mx8str = java.util.Arrays.copyOf(mx7str, mx7str.length);
        System.out.println("Copy of string array is: ");
        for (String asdqwe: mx8str) {
            System.out.print(asdqwe+"-");
        }
        System.out.println("\n");

        String[] mxsync = mx7str;     //при присвоении массивов друг другу они СИНХРОНИЗИРУЮТСЯ, и при замене одного
        mx7str[0] = "666Satan";       // из элементов в одном М-ве меняется соотв. эл-т в другом М-ве
        System.out.println("mx7str[0] = \"666Satan\"");
        System.out.println("mxsync[0] = "+mxsync[0]);
        System.out.println("\n");

        System.out.println("МАССИВ КЛАССОВ (ссылочный) ============");
        class RandClass {};
        RandClass el0 = new RandClass();
        RandClass el1 = new RandClass();
        RandClass el2 = new RandClass();
        RandClass el3 = new RandClass();
        RandClass [] mx10 = new RandClass[4];
        mx10[0] = el0;
        mx10[1] = el1;
        mx10[2] = el2;
        mx10[3] = el3;
        System.out.println("Длина ссыл. массива = "+mx10.length+" элемента");
        for (RandClass hz: mx10) {
            System.out.println(hz);
        }
//        Arrays.sort(mx10);                          //СОРТИРОВКА объектов, по ходу, не канает
//        System.out.println("Sorted Objects:");
//        for (RandClass ads: mx10) {
//            System.out.println(ads);
//        }
        System.out.println("\n");

        System.out.println("СОРТИРОВКА ЭЛЕМЕНТОВ ====================");
        int[] mxints = {10,9,1,2,51,13,41,63,54};
        System.out.println("Unsorted ints: 10,9,1,2,51,13,41,63,54");
        Arrays.sort(mxints);
        System.out.print("Sorted ints: ");
        for (int asdq: mxints) {
            System.out.print(asdq+"-");
        }
        System.out.println("\n");

        char[] mxchar2 = {'z','f','!','&','f','h','u','0','~','7','2','F','D'};
        System.out.println("Unsorted chars: z,f,!,&,f,h,u,0,~,7,2,F,D");
        Arrays.sort(mxchar2);
        System.out.print("Sorted chars: ");
        for (char asdqwee: mxchar2) {
            System.out.print(asdqwee+"-");
        }
        System.out.println("\n");

        String[] ar1 = {"a", "b"};
        String[] ar2 = {"a", "c"};
        System.out.println("{\"a\", \"b\"} and {\"a\", \"c\"}");
        System.out.println("Comparing: "+Arrays.compare(ar1, ar2));
        System.out.println("Equals: "+Arrays.equals(ar1, ar2));
        System.out.println("Mismatch index: "+Arrays.mismatch(ar1,ar2));
        Arrays.fill(ar1, "ZZZ");
        System.out.println(ar1[0]+" "+ar1[1]);

        int j=0;
        do {System.out.print(j+"-"); j++;}
        while (j<20);
    }
}
