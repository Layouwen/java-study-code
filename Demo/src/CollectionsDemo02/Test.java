package CollectionsDemo02;

import CollectionDemo.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
  public static void main(String[] args) {
    ArrayList<Student> array = new ArrayList<Student>();

    Student st1 = new Student("梁又文", 20);
    Student st2 = new Student("梁金俊", 21);
    Student st3 = new Student("王煜", 19);

    array.add(st1);
    array.add(st2);
    array.add(st3);

    // 排序
    Collections.sort(array, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        int num = o1.getAge() - o2.getAge();
        int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
        return num2;
      }
    });

    // 遍历
    for (Student s : array) {
      System.out.println(s.getName() + "," + s.getAge());
    }
  }
}
