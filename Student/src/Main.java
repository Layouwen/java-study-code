import javax.swing.text.Style;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Student> array = new ArrayList<Student>();

    while (true) {
      System.out.println("--------学生管理系统--------");
      System.out.println("1 添加学生");
      System.out.println("2 删除学生");
      System.out.println("3 修改学生");
      System.out.println("4 查看所有学生");
      System.out.println("5 退出");
      System.out.println("请输入你的选择：");

      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();

      switch (line) {
        case "1":
          addStudent(array);
          break;
        case "2":
          deleteStudent(array);
          break;
        case "3":
          updateStudent(array);
          break;
        case "4":
          findAllStudent(array);
          break;
        case "5":
          System.out.println("退出");
          System.exit(0);
      }
    }
  }

  public static boolean isUsed(ArrayList<Student> array, String sid) {
    // 查看学号是否存在
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i).getSid().equals(sid)) return true;
    }
    return false;
  }

  public static void addStudent(ArrayList<Student> array) {
    Scanner sc = new Scanner(System.in);
    System.out.println("输入你的学号：");
    String sid = sc.nextLine();
    if (isUsed(array, sid)) {
      System.out.println("学生已存在");
      return;
    }
    System.out.println("输入你的名字：");
    String name = sc.nextLine();
    System.out.println("输入你的年龄：");
    String age = sc.nextLine();
    System.out.println("输入你的地址：");
    String address = sc.nextLine();
    Student stu = new Student(sid, name, age, address);
    array.add(stu);
    System.out.println("添加学生成功！");
  }

  public static void findAllStudent(ArrayList<Student> array) {
    if (array.size() == 0) {
      System.out.println("没有数据，请添加后在尝试！");
      return;
    }
    System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");
    for (int i = 0; i < array.size(); i++) {
      Student s = array.get(i);
      System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t\t" + s.getAddress());
    }
  }

  public static void deleteStudent(ArrayList<Student> array) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入你需要删除的学号：");
    String sid = sc.nextLine();
    int index = -1;
    for (int i = 0; i < array.size(); i++) {
      Student s = array.get(i);
      if (s.getSid().equals(sid)) {
        index = i;
      }
    }
    if (index == -1) {
      System.out.println("没有该学生");
    } else {
      array.remove(index);
      System.out.println("删除学生成功！");
    }
  }

  public static void updateStudent(ArrayList<Student> array) {
    int index = -1;

    Scanner sc = new Scanner(System.in);
    System.out.println("请输入你需要修改的学号：");
    String sid = sc.nextLine();
    Student stu = new Student();
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i).getSid().equals(sid)) {
        index = i;
        System.out.println("请输入新的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入新的年龄：");
        String age = sc.nextLine();
        System.out.println("请输入新的地址：");
        String address = sc.nextLine();

        stu.setSid(sid);
        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);
      }
    }
    if (index == -1) {
      System.out.println("没有该学生！");
    } else {
      array.set(index, stu);
      System.out.println("修改成功！");
    }
  }
}
