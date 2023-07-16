//https://www.digitalocean.com/community/tutorials/java-socket-programming-server-client
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
   public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException{
      InetAddress host = InetAddress.getLocalHost();

      for(int i=0; i<5;i++){

         Socket socket = new Socket(host.getHostName(), 9876);

         ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
         System.out.println("Sending request to Socket Server");

         if(i==4)oos.writeObject("exit");
         else oos.writeObject(""+i);
         ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
         String message = (String) ois.readObject();
         System.out.println("Message: " + message);

         ois.close();
         oos.close();
         Thread.sleep(100);
      }
   }
}
