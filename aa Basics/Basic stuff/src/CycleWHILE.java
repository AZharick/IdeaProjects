import java.io.IOException;
import java.util.Scanner;
                                  //WHILE, DO WHILE, CONTINUE
public class CycleWHILE {
    public static void main(String[] args) throws IOException {

        int count = 1;     //WHILE
        while (count < 10) {
            System.out.print("A" + count + "-");
            count++;
        }

        System.out.print("\n");

        count = 1;       //DO WHILE - at least one iteration's run
        do {
            System.out.print("B" + count + "-");
            count++;
        }
        while (count < 10);

        System.out.print("\n");

        count = 1;           // CONTINUE;
        while (count < 20) {
            if ((count%2) != 0) continue;
            System.out.print("C" + count + " ");
            count++;
        }
    }
}
