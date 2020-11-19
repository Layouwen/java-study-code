package 集合到文件改进版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Start {
  public static void main(String[] args) throws IOException {
    // 创建集合
    ArrayList<Student> array = new ArrayList<Student>();

    // 创建学生
    Student s1 = new Student("10086", "梁又文", 20, "广州");
    Student s2 = new Student("10087", "梁金俊", 21, "佛山");
    Student s3 = new Student("10088", "王煜", 19, "西安");
    Student s4 = new Student("10089", "杨青青", 22, "西藏");

    // 添加到集合
    array.add(s1);
    array.add(s2);
    array.add(s3);
    array.add(s4);

    // 创建字符缓冲输出流对象
    BufferedWriter bw = new BufferedWriter(new FileWriter("./students.txt"));

    // 遍历集合，得到每个对象
    for (Student s : array) {
      // 对每个对象拼接自定义格式
      StringBuilder sb = new StringBuilder();
      sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

      // 调用字符缓冲输出对象的方法写数据
      bw.write(sb.toString());
      bw.newLine();
      bw.flush();
    }

    // 释放资源
    bw.close();
  }
}
