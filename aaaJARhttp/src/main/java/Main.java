import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

   public static void main(String[] args) throws IOException {
      System.out.println("Hello");
      String googleImg = "https://aif-s3.aif.ru/images/031/896/4e3bdf75d02ab23a01dc73634ee2d2a7.jpg";

      CloseableHttpClient client = HttpClientBuilder.create()
              .setDefaultRequestConfig(RequestConfig.custom()
                      .setConnectTimeout(5000)
                      .setSocketTimeout(30000)
                      .setRedirectsEnabled(false)
                      .build())
              .build();

      HttpGet request = new HttpGet(googleImg);
      CloseableHttpResponse responseImg = client.execute(request);
      byte[] picBytes = responseImg.getEntity().getContent().readAllBytes();
      try(FileOutputStream fos = new FileOutputStream("GOOGLE.png")){
         fos.write(picBytes);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}