package 点名器;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Start {
  public static void main(String[] args) throws IOException {
    // 创建字符缓冲输入流对象
    BufferedReader br = new BufferedReader(new FileReader("./names.txt"));

    // 创建ArrayList集合对象
    ArrayList<String> array = new ArrayList<String>();

    // 调用字符缓冲输入流对象的方法读数据
    String line;
    while ((line = br.readLine()) != null) {
      array.add(line);
    }

    // 释放资源
    br.close();

    // 随机产生随机数
    Random r = new Random();
    int index = r.nextInt(array.size());

    // 随机获取里面的值
    String name = array.get(index);

    // 输出到控制台
    System.out.println("抽到了：" + name);
  }
}