package 复制Java文件打印流改进版;

import java.io.*;

public class Start {
  public static void main(String[] args) throws IOException {
    /*
    普通方式
    // 创建字符输入流对象
    BufferedReader br = new BufferedReader(new FileReader("./demo1-content.java"));
    // 输出到目标位置
    BufferedWriter bw = new BufferedWriter(new FileWriter("./demo1-content-copy.java"));

    // 读写数据，复制文件
    String line;
    while ((line = br.readLine()) != null) {
      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    // 释放资源
    br.close();
    bw.close();
    */

    // 打印流
    // 创建字符输入流对象
    BufferedReader br = new BufferedReader(new FileReader("./demo1-content.java"));
    // 使用打印路输出到目标位置
    PrintWriter pw = new PrintWriter(new FileWriter("./demo1-content-copy.java"), true);

    String line;
    while ((line = br.readLine()) != null) {
      pw.println(line);
    }

    pw.close();
    br.close();
  }
}
