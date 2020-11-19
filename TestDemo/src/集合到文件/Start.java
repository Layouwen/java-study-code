package 集合到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Start {
  public static void main(String[] args) throws IOException {
    // 创建ArrayList数组
    ArrayList<String> array = new ArrayList<String>();

    // 存储数据
    array.add("liangjinjun");
    array.add("layouwen");
    array.add("wangyu");

    // 创建字符缓冲流输出对象
    BufferedWriter bw = new BufferedWriter(new FileWriter("./集合到文件.txt"));

    // 遍历集合，得到每一个字符串数据
    for (String s : array) {
      // 调用字符缓冲输出流对象的方法写数据
      bw.write(s);
      bw.newLine();
      bw.flush();
    }

    // 释放资源
    bw.close();
  }
}
