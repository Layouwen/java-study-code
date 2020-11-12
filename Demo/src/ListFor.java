import CollectionDemo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListFor {
  public static void main(String[] args) {
    List<Student> ls = new ArrayList<Student>();
    ls.add(new Student("layouwen", 20));
    ls.add(new Student("wangyu", 19));
    ls.add(new Student("liangjinjun", 22));

    ListIterator<Student> li = ls.listIterator();
    while (li.hasNext()) {
      Student s = li.next();
      System.out.println(s.getName() + "," + s.getAge());
    }
    System.out.println("----------------");

    for (int i = 0; i < ls.size(); i++) {
      Student item = ls.get(i);
      System.out.println(item.getName() + "," + item.getAge());
    }
    System.out.println("----------------");

    for (Student i : ls) {
      System.out.println(i.getName() + "," + i.getAge());
    }
  }
}
