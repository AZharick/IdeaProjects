import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//гоша дударь
public class GUI extends JFrame{
   private JButton button = new JButton("Press me");
   private JTextField inputField = new JTextField("Input text here", 10);
   private JLabel label = new JLabel("Enter something here");
   private JRadioButton radio1 = new JRadioButton("Select 1");
   private JRadioButton radio2 = new JRadioButton("Select 2");
   private JCheckBox check = new JCheckBox("Check this", false);

   public GUI() {
      super("App title"); // передаем в К-р родителя название Формы
      this.setBounds(300,300,850,400);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Container container = this.getContentPane();
      container.setLayout(new GridLayout(3, 2, 2, 2));//ширина выстоа отступы
      container.add(label);
      container.add(inputField);
      container.add(check);

      ButtonGroup group = new ButtonGroup();
      group.add(radio1);
      group.add(radio2);
      container.add(radio1);
      radio1.setSelected(true);
      container.add(radio2);

      button.addActionListener(new MyButtonEventListener());
      container.add(button);
   }

   class MyButtonEventListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String message = "";
         message += "Button was pressed\n";
         message += "Text is " + inputField.getText() + "\n";
         message += (radio1.isSelected() ? "Radio1" : "Radio2") + " is selected\n";
         message += "Checkbox is " + ((check.isSelected()) ? "checked\n" : "unchecked\n");
         //null=нет родит. формы;
         JOptionPane.showMessageDialog(null, message, "output", JOptionPane.PLAIN_MESSAGE);
      }
   }

}