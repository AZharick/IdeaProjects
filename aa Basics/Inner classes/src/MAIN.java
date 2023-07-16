import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        System.out.println("Enter your PC ID:");
        Scanner scanner = new Scanner(System.in);
        String pcid = scanner.nextLine();
        PC komp = new PC (pcid);
           komp.startPC();
    }
}
