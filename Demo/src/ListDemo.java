import CollectionDemo.Student;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List<Student> ls = new ArrayList<Student>();
    Student stu1 = new Student("layouwen", 20);
    Student stu2 = new Student("wangyu", 19);
    Student stu3 = new Student("liangjinjun", 22);
    ls.add(stu1);
    ls.add(stu2);
    ls.add(stu3);
//    it.hasNext()
    for (int i = 0; i < ls.size(); i++) {
      System.out.println(ls.get(i).getName());
    }
  }
}
