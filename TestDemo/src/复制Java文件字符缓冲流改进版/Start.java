package 复制Java文件字符缓冲流改进版;

import java.io.*;

public class Start {
  public static void main(String[] args) throws IOException {
    // 输入流
    BufferedReader br = new BufferedReader(new FileReader("./bufferedReader.txt"));
    // 输出流
    BufferedWriter bw = new BufferedWriter(new FileWriter("./bufferedRead.txt"));

    // 读写数据，复制文件
    // 一次读写一个字符
//    int ch;
//    while ((ch = br.read()) != -1) {
//      bw.write(ch);
//    }

    // 一次读取一个字符数组数据
    char[] chs = new char[1024];
    int len;
    while ((len = br.read(chs)) != -1) {
      bw.write(chs, 0, len);
    }

    // 释放资源
    bw.close();
    br.close();

  }
}
