package 复制视频;

import java.io.*;

public class Start {
  public static void main(String[] args) throws IOException {
    // 开始记录时间
    long startTime = System.currentTimeMillis();

    // 复制视频
    // 方法1
//    method1();
    // 方法2
//    method2();
    // 方法3
//    method3();
    // 方法4
    method4();

    // 记录时间结束
    long endTime = System.currentTimeMillis();
    System.out.println("共耗时" + (endTime - startTime) + "毫秒");
  }

  // 基本字节流一次读写一个字节
  public static void method1() throws IOException {
    FileInputStream fis = new FileInputStream("/Users/liangyouwen/Desktop/demo.mp4");
    FileOutputStream fos = new FileOutputStream("/Users/liangyouwen/Desktop/demo-copy.mp4");

    int by;
    while ((by = fis.read()) != -1) {
      fos.write(by);
    }

    fos.close();
    fis.close();
  }

  // 基本字节流一次读写一个字节
  public static void method2() throws IOException {
    FileInputStream fis = new FileInputStream("/Users/liangyouwen/Desktop/demo.mp4");
    FileOutputStream fos = new FileOutputStream("/Users/liangyouwen/Desktop/demo-copy.mp4");

    byte[] bys = new byte[1024];
    int len;
    while ((len = fis.read(bys)) != -1) {
      fos.write(bys, 0, len);
    }

    fos.close();
    fis.close();
  }

  // 字节缓冲流一次读写一个字节
  public static void method3() throws IOException {
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/liangyouwen/Desktop/demo.mp4"));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/liangyouwen/Desktop/demo-copy.mp4"));

    int by;
    while ((by = bis.read()) != -1) {
      bos.write(by);
    }

    bos.close();
    bis.close();
  }

  // 字节缓冲流一次读写一个字节数组
  public static void method4() throws IOException {
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/liangyouwen/Desktop/demo.mp4"));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/liangyouwen/Desktop/demo-copy.mp4"));

    byte[] bys = new byte[1024];
    int len;
    while ((len = bis.read(bys)) != -1) {
      bos.write(bys, 0, len);
    }

    bos.close();
    bis.close();
  }
}
