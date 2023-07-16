package ru.netology.graphics.image;

public class MySchema implements TextColorSchema {
   char[] chars = {'#', '$', '@', '%', '*', '+', '-', '\''};
   @Override
   public char convert(int color) {
      return chars[Math.max(color / 32, 0)];
   }
}