package BufferedOutputStream;

import java.io.*;

public class Start {
  public static void main(String[] args) throws IOException {
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/liangyouwen/Desktop/Demo1.txt"));
    bos.write("hello\r".getBytes());
    bos.write("world\r".getBytes());

    bos.close();

    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/liangyouwen/Desktop/Demo1.txt"));

    // 一次读一个字节
//    int by;
//    while ((by = bis.read()) != -1) {
//      System.out.println((char) by);
//    }

    // 一次读一个字节数组
    byte[] bys = new byte[1024];
    int len;
    while ((len = bis.read(bys)) != -1) {
      System.out.print(new String(bys, 0, len));
    }

    bis.close();
  }
}
