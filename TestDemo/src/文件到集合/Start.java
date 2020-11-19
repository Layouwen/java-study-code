package 文件到集合;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Start {
  public static void main(String[] args) throws IOException {
    // 创建字符缓冲输入流对象
    BufferedReader br = new BufferedReader(new FileReader("./集合到文件.txt"));

    // 创建ArrayList集合对象
    ArrayList<String> array = new ArrayList<String>();

    // 调用字符缓冲输入流对象方法数数据
    String line;
    while ((line = br.readLine()) != null) {
      array.add(line);
    }

    // 释放资源
    br.close();

    // 遍历集合
    for (String s : array) {
      System.out.println(s);
    }
  }
}
