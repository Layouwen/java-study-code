package 复制Java文件;

import java.io.*;

public class Start {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(new FileInputStream("./test.txt"));

    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./test-demo.txt"));

    // 读数据
    // 一次读一个数据
    int ch;
    while ((ch = isr.read()) != -1) {
      osw.write(ch);
    }

    // 一次读写一个字符数组数据
    char[] chs = new char[1024];
    int len;
    while ((len = isr.read(chs)) != -1) {
      osw.write(chs, 0, len);
    }

    // 释放资源
    osw.close();
    isr.close();

  }
}
