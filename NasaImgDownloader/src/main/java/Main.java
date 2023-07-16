import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
   public static final String address = "https://api.nasa.gov/planetary/apod?api_key=gGnjdUjiJkXZ1tmB5ff39x17ipr12BwpHae71VVc";
   public static ObjectMapper mapper = new ObjectMapper();
   public static CloseableHttpClient httpClient;
   public static Nasa nasaInfo;

   public static void main(String[] args) throws IOException {
      httpClient = HttpClientBuilder.create()
              .setDefaultRequestConfig(RequestConfig.custom()
                      .setConnectTimeout(5000)
                      .setSocketTimeout(30000)
                      .setRedirectsEnabled(false)
                      .build())
              .build();

      HttpGet request = new HttpGet(address);
      CloseableHttpResponse response = httpClient.execute(request);
      nasaInfo = mapper.readValue(response.getEntity().getContent(), Nasa.class);

      File topDir = new File("D:\\! Visual");
      if(!topDir.exists()) {
         topDir.mkdir();
      }

      File subDir = new File("D:\\! Visual\\NASA images");
      if(!subDir.exists()) {
         subDir.mkdir();
      }

      String pictureName = getFileNameFromURL(nasaInfo.getUrl());
      String fullPath = subDir.getPath() + "\\" + pictureName;
      File todayImage = new File(fullPath);
      getTodayImage(todayImage, fullPath);
   }

   public static String getFileNameFromURL(String url) {
      int slashIndex = url.lastIndexOf('/');
      return url.substring(slashIndex + 1);
   }

   public static void getTodayImage(File file, String path) throws IOException {
      if (!file.exists()) {
         HttpGet requestForPicture = new HttpGet(nasaInfo.getUrl());
         CloseableHttpResponse responsePicture = httpClient.execute(requestForPicture);
         byte[] picBytes = responsePicture.getEntity().getContent().readAllBytes();
         try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(picBytes);
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
}