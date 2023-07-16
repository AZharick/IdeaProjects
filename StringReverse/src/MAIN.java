import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        System.out.println("Enter a word to reverse: ");
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        char [] rev = new char[x.length()];
        int i;
        int y = 0;
        for  (i=x.length()-1; i>=0; i--) {
            rev [y] = x.charAt(i);
            y++;
        }
        System.out.println("Reversed string is:");
        for (char ch : rev) {
            System.out.print(ch);
        }
    }
}
