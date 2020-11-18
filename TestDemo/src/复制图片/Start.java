package 复制图片;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Start {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("/Users/liangyouwen/Desktop/pink.jpeg");
    FileOutputStream fos = new FileOutputStream("/Users/liangyouwen/Desktop/pink-copy.jpeg");

    byte[] bys = new byte[1024];
    int len;
    while ((len = fis.read(bys)) != -1) {
      fos.write(bys, 0, len);
    }

    fis.close();
    fos.close();
  }
}
