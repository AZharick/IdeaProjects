import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//NOT WORKING SHIT FROM NETOLOGY

public class Client {

   public static void main(String[] args) throws IOException {
      String host = "127.0.0.1";
      int port = 8089;

      try(Socket clientSocket = new Socket(host, port);
          BufferedOutputStream bos = new BufferedOutputStream(clientSocket.getOutputStream());
          PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
          BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){

         String name = "Alex";
         byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
          bos.write(bytes);

          String response = in.readLine();
          System.out.println(response);
      }
   }
}