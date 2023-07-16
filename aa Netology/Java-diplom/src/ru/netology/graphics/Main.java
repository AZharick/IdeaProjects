package ru.netology.graphics;

import ru.netology.graphics.image.BadImageSizeException;
import ru.netology.graphics.image.MyConverter;
import ru.netology.graphics.image.MySchema;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

import java.io.File;
import java.io.PrintWriter;

public class Main {
   public static void main(String[] args) throws Exception {
      TextGraphicsConverter converter = new MyConverter(); // Создайте тут объект вашего класса конвертера
      GServer server = null;
      try {
         server = new GServer(converter);
      } catch (BadImageSizeException exception) {
         System.out.println(exception.getMessage());
      }
      server.start(); // Запускаем

      //Или то же, но с выводом на экран:
//      MyConverter converter = new MyConverter();
//      String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
//      String url2 = "https://i.ibb.co/6DYM05G/edu0.jpg";

//      converter.setMaxRatio(1.3);
//      String imgTxt = "";
//      try {
//         imgTxt = converter.convert(url);
//      } catch (BadImageSizeException exception) {
//         System.out.println(exception.getMessage());
//      }
//
//      System.out.println(imgTxt);
   }
}
