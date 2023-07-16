/** Program for quick-creating a copy of Diablo2-Resurrected SaveGames
 * C:\Users\Misthetique\Documents\Diablo II Resurrected\Save
 * */

package MisthyxLabs;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
   private static final String SAVES_DIR_PATH = "C:\\Users\\Misthetique\\Documents\\Diablo II Resurrected\\Save";
   private static File savesDir = new File(SAVES_DIR_PATH);

   public static void main(String[] args) throws IOException {
      //makeNewDirectory();

      List<File> fileList = new ArrayList<>();
      for (File f:getAllFilesFromDir(fileList, savesDir)) {
         System.out.println(f.getName());
      }

   }

   private static List<File> getAllFilesFromDir(List<File> list, File dir) {
      if (!dir.isDirectory()){
         return null;
      } else {

         for (File file : dir.listFiles()) {
            if (!file.isDirectory()) {
               list.add(file);
            } else {
               list.add(file);
               list.addAll(getAllFilesFromDir(list, file));
            }

         }
      }
      return list;
   }

   private static void copyFile(File source, File dest) throws IOException {
      InputStream is = null;
      OutputStream os = null;
      try {
         is = new FileInputStream(source);
         os = new FileOutputStream(dest);
         byte[] buffer = new byte[1024];
         int length;
         while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
         }
      } finally {
         is.close();
         os.close();
      }
   }

   private static void makeNewDirectory() {
      File dirForSaves = new File(generateDirName());
      if (!dirForSaves.exists()) {
         dirForSaves.mkdir();
      }
   }

   private static String generateDirName() {
      String datePattern = "[dd-MM-yyyy]-[HH-mm-ss]";
      DateFormat d = new SimpleDateFormat(datePattern);
      Date today = Calendar.getInstance().getTime();
      String str = d.format(today);
      return str;
   }

}