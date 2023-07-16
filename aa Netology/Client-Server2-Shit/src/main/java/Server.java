import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//NOT WORKING SHIT FROM NETOLOGY

public class Server {
   public static void main(String[] args) throws IOException {
      int port = 8089;

      try (ServerSocket ss = new ServerSocket(port)) {
         System.out.println("Server started!");

         while (true) {
            try (Socket s = ss.accept();
                 PrintWriter out = new PrintWriter(s.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())))
            {
               System.out.printf("New connection accepted: port %d%n", s.getPort());

               final String message = in.readLine();
               out.println(String.format("Message \"%s\" received from your port %d", message, s.getPort()));
            }
         }
      }
   }
}