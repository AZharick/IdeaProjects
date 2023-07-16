import java.io.Console;
public class ConMAIN {
    public static void main(String[] args) {

        /*в терминале:
        C:\Users\Misthetique\IdeaProjects\Console> cd src
        C:\Users\Misthetique\IdeaProjects\Console\src> javac ConMAIN.java
        C:\Users\Misthetique\IdeaProjects\Console\src> java ConMAIN*/

        String name;
        Console con = System.console();
        name = con.readLine("Enter your name: ");
        System.out.println(" Welcome, "+name);
    }
}
