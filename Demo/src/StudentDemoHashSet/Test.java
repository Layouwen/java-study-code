package StudentDemoHashSet;

import java.util.HashSet;

public class Test {
  public static void main(String[] args) {
    HashSet<Student> hst1 = new HashSet<Student>();

    Student s1 = new Student("layouwen", 20);
    Student s2 = new Student("liangjinjun", 21);
    Student s3 = new Student("yqq", 19);
    Student s4 = new Student("yqq", 19);

    hst1.add(s1);
    hst1.add(s2);
    hst1.add(s3);
    hst1.add(s4);

    for (Student s : hst1) {
      System.out.println(s.getName() + "," + s.getAge());
    }
  }
}
