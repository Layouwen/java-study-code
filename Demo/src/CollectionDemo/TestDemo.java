package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class TestDemo {
  public static void main(String[] args) {
    Collection<Student> cl = new ArrayList<Student>();
    for (int i = 0; i < 3; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入第" + (i + 1) + "学生的姓名:");
      String name = sc.nextLine();
      System.out.println("请输入第" + (i + 1) + "学号:");
      int age = sc.nextInt();
      Student stu = new Student(name, age);
      cl.add(stu);
    }
    Iterator<Student> it = cl.iterator();
    while (it.hasNext()) {
      Student s = it.next();
      System.out.println(s.getName() + "," + s.getAge());
    }
  }
}
