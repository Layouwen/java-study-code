package 集合到文件数据排序改进版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Start {
  public static void main(String[] args) throws IOException {
    // 创建TreeSet集合，通过比较器排序
    TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        // 主要条件
        int num = o2.getSum() - o1.getSum();
        // 次要条件
        int num2 = num == 0 ? o1.getYuwen() - o2.getYuwen() : num;
        int num3 = num2 == 0 ? o1.getShuxue() - o2.getShuxue() : num2;
        int num4 = num == 0 ? o1.getName().compareTo(o2.getName()) : num3;
        return num4;
      }
    });

    // 键盘录入学生数据
    for (int i = 0; i < 3; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入第" + (i + 1) + "个学生数据:");
      System.out.println("姓名");
      String name = sc.nextLine();
      System.out.println("语文");
      int yuwen = sc.nextInt();
      System.out.println("数学");
      int shuxue = sc.nextInt();
      System.out.println("英语");
      int yingyu = sc.nextInt();

      // 创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
      Student s = new Student();
      s.setName(name);
      s.setYuwen(yuwen);
      s.setShuxue(shuxue);
      s.setYingyu(yingyu);

      // 添加到集合
      ts.add(s);
    }

    // 字符流输出流对象
    BufferedWriter bw = new BufferedWriter(new FileWriter("./student-demo.txt"));

    // 遍历集合，写入内容
    for (Student s : ts) {
      // 格式化学生对象
      StringBuilder sb = new StringBuilder();
      sb.append(s.getName()).append(",").append(s.getYuwen()).append(",").append(s.getShuxue()).append(",").append(s.getYingyu()).append(",").append(s.getSum());

      // 写入数据
      bw.write(sb.toString());
      bw.newLine();
      bw.flush();
    }
  }
}
