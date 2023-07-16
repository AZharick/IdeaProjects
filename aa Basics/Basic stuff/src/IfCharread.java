import java.io.IOException;
                           // IF, (char) System.in.read();
public class IfCharread {
    public static void main (String[] args) throws IOException {
        char answer = 'h';
        char ch;
        System.out.print("Угадай букву, которую я загадал!");
        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.println("Congrats!");}
        else if (ch > answer) {
            System.out.println("Перебор!");}
        else
            System.out.println("Недобор!");
    }
}
