import javax.swing.*;
import java.awt.*;
//bro code
public class Main {

   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setVisible(true);
      frame.setTitle("Megaproga");

      Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();
      int horizont = sSize.width;
      int vertical = sSize.height;

      frame.setBounds(horizont/2 - 200, vertical/2 - 100, 400, 200);
      frame.setVisible(true);
   }
}
