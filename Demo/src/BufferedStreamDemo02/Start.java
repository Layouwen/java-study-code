package BufferedStreamDemo02;

import java.io.*;

public class Start {
  public static void main(String[] args) throws IOException {
    // 字符缓冲输出流
//    BufferedWriter bw = new BufferedWriter(new FileWriter("./demo1-content.java"));

    // 写数据
//    for (int i = 0; i < 10; i++) {
//      bw.write("hello" + i);
//      bw.write("\r");
//      bw.newLine();
//      bw.flush();
//    }

    // 释放资源
//    bw.close();

    // 字符缓冲输入流
    BufferedReader br = new BufferedReader(new FileReader("./demo1-content.java"));

    // 第一次读数据
//    String line = br.readLine();
//    System.out.println(line);

    String line;
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }

    br.close();
  }
}
