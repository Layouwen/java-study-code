package 复制文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Start {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("/Users/liangyouwen/Desktop/test.txt");
    FileOutputStream fos = new FileOutputStream("/Users/liangyouwen/Desktop/test-copy.txt");

    int by;
    while ((by = fis.read()) != -1) {
      fos.write(by);
    }

    fis.close();
    fos.close();
  }
}
