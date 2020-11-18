package 一次读一个字节数组;

import java.io.FileInputStream;
import java.io.IOException;

public class Start {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("/Users/liangyouwen/Desktop/test.txt");

    byte[] bys = new byte[1024];
    int len;
    while ((len = fis.read(bys)) != -1) {
      System.out.print(new String(bys, 0, len));
    }

    fis.close();
  }
}
