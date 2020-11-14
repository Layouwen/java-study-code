package GradeDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
  public static void main(String[] args) {
    TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        int num = (o1.getChinese() + o1.getMath()) - (o2.getChinese() + o2.getMath());
        int num2 = num == 0 ? o1.getChinese() - o2.getChinese() : num;
        int num3 = num == 0 ? o1.getName().compareTo(o2.getName()) : num2;
        return num2;
      }
    });

    Student s1 = new Student("梁又文", 99, 100);
    Student s2 = new Student("杨青青", 50, 55);
    Student s3 = new Student("梁金俊", 53, 70);
    Student s4 = new Student("王煜啊", 89, 34);
    Student s5 = new Student("王伟红", 80, 88);

    ts.add(s1);
    ts.add(s2);
    ts.add(s3);
    ts.add(s4);
    ts.add(s5);

    for (Student item : ts) {
      System.out.println(item.getName() + "," + item.getChinese() + "," + item.getMath() + "," + (item.getChinese() + item.getMath()));
    }
  }
}
