package ru.netology.graphics.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.net.URL;

public class MyConverter implements TextGraphicsConverter {

   private int maxWidth;
   private int maxHeight;
   private double maxRatio;
   private TextColorSchema convertersSchema;

   @Override
   public String convert(String url) throws IOException, BadImageSizeException {
      BufferedImage img = ImageIO.read(new URL(url));
      int originalWidth = img.getWidth();
      int originalHeight = img.getHeight();
      boolean isHorizontal = originalWidth > originalHeight;
      System.out.println("Original image size = " + originalWidth + "x" + originalHeight);

      //блок проверки maxRatio
      double ratio = isHorizontal
              ? (double) originalWidth / (double) originalHeight
              : (double) originalHeight / (double) originalWidth;
      System.out.printf("Original ratio = %.2f\n", ratio);

      if ((maxRatio != 0) && (ratio > maxRatio)) {
         throw new BadImageSizeException (ratio, maxRatio);
      }
      
      //блок проверки макс размеров
      int newWidth = 0;
      int newHeight = 0;

      if ((maxWidth == 0) && (maxHeight == 0)) {
         newHeight = originalHeight;
         newWidth = originalWidth;
         System.out.println("No max sizes set, preserving original image size...\n");
      } else {
         if ((originalWidth < maxWidth) && (originalHeight < maxHeight)) {
            newHeight = originalHeight;
            newWidth = originalWidth;
            System.out.println("Image is smaller than max size, no shrinking needed\n");
         } else {

            System.out.println("\nRESIZING IMAGE...");
            double widthDiffRate = 1;
            double heightDiffRate = 1;

            //1 условие: заданы оба max параметра
            if ((maxWidth != 0) && (maxHeight != 0)) {
               System.out.println("Both maxHeight and maxWidth are set!");
               if (originalWidth > maxWidth) {
                  widthDiffRate = (double) originalWidth / (double) maxWidth;
               }
               if (originalHeight > maxHeight) {
                  heightDiffRate = (double) originalHeight / (double) maxHeight;
               }
               double widthViaHeightRate = originalWidth / heightDiffRate;
               double heightViaWidthRate = originalHeight / widthDiffRate;
               
               if (heightViaWidthRate > maxHeight) {
                 newWidth = (int) Math.round(originalWidth / heightDiffRate);
                 newHeight = (int) Math.round(originalHeight / heightDiffRate);

               } else {
                  newWidth = (int) Math.round(originalWidth / widthDiffRate);
                  newHeight = (int) Math.round(originalHeight / widthDiffRate);
               }
               System.out.println("New image size: " + newWidth + "x" + newHeight + "\n");
            }

            //2 условие: задана только макс ширина
            if ((maxWidth != 0) && (maxHeight == 0)) {
               System.out.println("Only max width is set!");
               if (originalWidth > maxWidth) {
                  newWidth = maxWidth;
                  if (isHorizontal) {
                     newHeight = (int) Math.round(newWidth / ratio);
                  } else {
                     newHeight = (int) Math.round(newWidth * ratio);
                  }
               } else {
                  System.out.println("Max width exceeds original width, no shrinking needed");
                  newWidth = originalWidth;
                  newHeight = originalHeight;
               }
               System.out.println("New image size: " + newWidth + "x" + newHeight + "\n");
            }

            //3 условие: задана только макс высота
            if ((maxHeight != 0) && (maxWidth == 0)) {
               System.out.println("Only max height is set!");
               newHeight = maxHeight;
               if (originalHeight > maxHeight) {
                  newHeight = maxHeight;
                  if (isHorizontal) {
                     newWidth = (int) Math.round(newHeight * ratio);
                  } else {
                     newWidth = (int) Math.round(newHeight / ratio);
                  }
               } else {
                  System.out.println("Max height exceeds original height, no shrinking needed");
                  newWidth = originalWidth;
                  newHeight = originalHeight;
               }
               System.out.println("New image size: " + newWidth + "x" + newHeight + "\n");
            }
         }
      }//конец проверки макс. размеров

      Image scaledImage = img.getScaledInstance(newWidth, newHeight, BufferedImage.SCALE_SMOOTH);
      BufferedImage bwImg = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_BYTE_GRAY);
      Graphics2D graphics = bwImg.createGraphics();
      graphics.drawImage(scaledImage, 0, 0, null);
      WritableRaster bwRaster = bwImg.getRaster();
      MySchema schema = new MySchema();

      StringBuilder finalText = new StringBuilder();
      for (int h = 0; h < newHeight; h++) {
         for (int w = 0; w < newWidth; w++) {
            int color = bwRaster.getPixel(w, h, new int[3])[0];
            char c = schema.convert(color);
            finalText.append(c);
            finalText.append(c);
         }
         finalText.append('\n');
      }

      return finalText.toString();
   }

   @Override
   public void setMaxWidth(int width) {
      this.maxWidth = width;
      System.out.println("New max width = " + this.maxWidth);
   }

   @Override
   public void setMaxHeight(int height) {
      this.maxHeight = height;
      System.out.println("New max height = " + this.maxHeight);
   }

   @Override
   public void setMaxRatio(double maxRatio) {
      this.maxRatio = maxRatio;
      System.out.println("New max ratio = " + this.maxRatio);
   }

   @Override
   public void setTextColorSchema(TextColorSchema schema) {
      this.convertersSchema = schema;
   }
}
