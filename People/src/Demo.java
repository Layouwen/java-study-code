public class Demo {
  public static void main(String[] args) {
    Student stu = new Student();
    stu.setAge(19);
    stu.setName("梁又文");
    stu.study();
    System.out.println(stu.getAge() + "," + stu.getName());

    System.out.println("_________");

    Teacher tea = new Teacher();
    tea.setAge(30);
    tea.setName("梁金俊");
    tea.teach();
    System.out.println(tea.getAge() + "," + tea.getName());

    Teacher tea2 = new Teacher("武汉三", 23);
    System.out.println(tea2.getName() + "," + tea2.getAge());

  }
}
