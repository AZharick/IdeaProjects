package MisthyxLabs;
import java.io.File;

public class Main {
   public static void deleteDirTree(File dir) {
      File[] arrFiles = dir.listFiles();
      for (File f : arrFiles) {
         if (!f.isDirectory()) {
            f.delete();
         } else {
            deleteDirTree(f);
         }
      }
      for (File f:arrFiles) {
         f.delete();
      }
   }

   public static void main(String[] args) throws Exception{
      File dir = new File("C:\\Users\\Misthetique\\IdeaProjects", "aaa");

      System.out.println("Path: " + dir.getAbsolutePath());
      System.out.println("Name: " + dir.getName());

      if (dir.exists()) {
         System.out.println("File exists");
      } else {
         System.out.println("File doesn't exist");
      }

      if (dir.isDirectory()) {
         System.out.println("It's a folder");
      } else {
         System.out.println("It's not a folder");
      }

      System.out.println("Deleting...");
      deleteDirTree(dir);

      if (dir.delete()) {
         System.out.println("УДАЛЕНО!");
         System.out.println("УДАЛЕНО!");
         Thread.sleep(1000);
      } else {
         System.out.println("Folder wasn't deleted");
      }

   }

}