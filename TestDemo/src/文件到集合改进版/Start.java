package 文件到集合改进版;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Start {
  public static void main(String[] args) throws IOException {
    // 创建字符缓冲输入流对象
    BufferedReader br = new BufferedReader(new FileReader("./students.txt"));

    // 创建ArrayList集合
    ArrayList<Student> array = new ArrayList<Student>();

    // 调用字符缓冲输入流对象的方法读数据
    String line;
    while ((line = br.readLine()) != null) {
      // 对每个字符进行分割
      String[] strArray = line.split(",");

      // 创建学生对象
      Student s = new Student();

      // 将分割的数据赋值给学生对象
      s.setSid(strArray[0]);
      s.setName(strArray[1]);
      s.setAge(Integer.parseInt(strArray[2]));
      s.setAddress(strArray[3]);

      // 添加到集合
      array.add(s);
    }

    // 释放资源
    br.close();

    // 遍历集合
    for (Student s : array) {
      System.out.println(s.getSid() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
    }
  }
}
