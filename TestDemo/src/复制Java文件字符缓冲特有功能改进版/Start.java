package 复制Java文件字符缓冲特有功能改进版;

import java.io.*;

public class Start {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("./demo2-content.java"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("./demo2-content-copy.java"));

    // 读写数据，复制文件
    // 使用字符缓冲流特有功能实现
    String line;
    while ((line = br.readLine()) != null) {
      bw.write(line);
    }

    // 释放资源
    br.close();
    bw.close();
  }
}
