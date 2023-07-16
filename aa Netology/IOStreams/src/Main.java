import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {

   public static void main(String[] args) throws IOException, ClassNotFoundException {

      install();

      GameProgress gp1 = new GameProgress(100, 100, 5, 500);
      GameProgress gp2 = new GameProgress(89, 50, 4, 400);
      GameProgress gp3 = new GameProgress(78, 30, 3, 300);

      String saveGamesPath = "E:\\Games\\savegames";
      List<String> saves = new ArrayList<>();
      saves.add(saveGamesPath + "\\save1.dat");
      saves.add(saveGamesPath + "\\save2.dat");
      saves.add(saveGamesPath + "\\save3.dat");

      saveGame(gp1, saves.get(0));
      saveGame(gp2, saves.get(1));
      saveGame(gp3, saves.get(2));

      String archivePath = saveGamesPath + "\\SavesArchive.zip";
      zipFiles(archivePath, saves);

      File file1 = new File(saves.get(0));
      file1.delete();
      File file2 = new File(saves.get(1));
      file2.delete();
      File file3 = new File(saves.get(2));
      file3.delete();

      unZip(archivePath, saveGamesPath);
      System.out.println(loadGame(saves.get(0)).toString());
   }

   public static void install() throws IOException {
      StringBuilder sb = new StringBuilder();
      String[] dirsToCreate = {
              "E:\\Games\\temp",
              "E:\\Games\\savegames",
              "E:\\Games\\src\\main",
              "E:\\Games\\src\\test",
              "E:\\Games\\res\\drawables",
              "E:\\Games\\res\\vectors",
              "E:\\Games\\res\\icons",
      };

      for (String s : dirsToCreate) {
         createDirTree(s);
         String result = "Created dirTree - " + s;
         sb.append(result + System.lineSeparator());
      }

      String[] filesToCreate = {
              dirsToCreate[0] + "\\temp.txt",
              dirsToCreate[2] + "\\Main.java",
              dirsToCreate[2] + "\\Utils.java",
      };

      for (int i = 0; i < filesToCreate.length; i++) {
         File file = new File(filesToCreate[i]);
         file.createNewFile();
         String result = "Created file - " + filesToCreate[i];
         sb.append(result + System.lineSeparator());
      }

      File log = new File("E:\\Games\\Temp\\temp.txt");
      writeLog(sb.toString(), log);

   }

   //openProgress() в задании
   public static GameProgress loadGame(String savePath) throws IOException, ClassNotFoundException {
      GameProgress gp;
      try (FileInputStream fis = new FileInputStream(savePath);
           ObjectInputStream ois = new ObjectInputStream(fis)) {
         gp = (GameProgress) ois.readObject();
      }
      return gp;
   }

   //openZip() в задании
   public static void unZip(String sourceZip, String unpackDestination) throws FileNotFoundException {
      try (ZipInputStream zis = new ZipInputStream(new FileInputStream(sourceZip))) {
         ZipEntry entry;
         while ((entry = zis.getNextEntry()) != null) {
            File file = new File(unpackDestination, entry.getName());
            FileOutputStream fos = new FileOutputStream(file);
            for (int c = zis.read(); c != -1; c = zis.read()) {
               fos.write(c);
            }
            fos.flush();
            zis.closeEntry();
            fos.close();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static void zipFiles(String outputZip, List<String> filesToPack) {
      try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(outputZip))) {
         for (int i = 0; i < filesToPack.size(); i++) {
            FileInputStream fis = new FileInputStream(filesToPack.get(i));
            ZipEntry entry = new ZipEntry("save" + (i + 1) + ".dat");
            zout.putNextEntry(entry);
            byte[] bytes1 = new byte[fis.available()];
            fis.read(bytes1);
            zout.write(bytes1);
            fis.close();
         }
         zout.closeEntry();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static void saveGame(GameProgress gp, String saveFilePath) {
      try (FileOutputStream fos = new FileOutputStream(saveFilePath);
           ObjectOutputStream oos = new ObjectOutputStream(fos)) {
         oos.writeObject(gp);
      } catch (FileNotFoundException fileNotFoundException) {
         System.out.println(fileNotFoundException.getMessage());
      } catch (IOException ioException) {
         System.out.println(ioException.getMessage());
      }
   }

   public static void writeLog(String s, File file) {
      try (FileWriter fileWriter = new FileWriter(file)) {
         fileWriter.write(String.valueOf(s));
      } catch (IOException e) {
         System.out.println("Exception: Log writing failed!");
      }
   }

   public static void createDirTree(String path) {
      File file = new File(path);
      file.mkdirs();
   }

}