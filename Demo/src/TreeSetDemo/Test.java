package TreeSetDemo;

import java.util.TreeSet;

public class Test {
  public static void main(String[] args) {
    TreeSet<Integer> tint = new TreeSet<Integer>();

    tint.add(10);
    tint.add(230);
    tint.add(21);
    tint.add(8);
    tint.add(8);

    for (Integer item : tint) {
      System.out.println(item);
    }

    TreeSet<Student> tsn = new TreeSet<Student>();

    Student s1 = new Student("lyw", 20);
    Student s2 = new Student("ljj", 21);
    Student s3 = new Student("yq", 19);
    Student s4 = new Student("yq", 19);

    tsn.add(s1);
    tsn.add(s2);
    tsn.add(s3);
    tsn.add(s4);

    for (Student item : tsn) {
      System.out.println(item.getName() + "," + item.getAge());
    }
  }
}
