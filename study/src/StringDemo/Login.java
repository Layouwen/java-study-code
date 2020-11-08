package StringDemo;

import java.util.Scanner;

public class Login {
  public static void main(String[] args) {
    String name = "layouwen";
    String pwd = "123";

    for (int i = 0; i < 3; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入你的用户名：");
      String inputName = sc.nextLine();
      System.out.println("请输入你的密码：");
      String inputPwd = sc.nextLine();
      if (inputName.equals(name) && inputPwd.equals(pwd)) {
        System.out.println("登录成功");
        break;
      } else {
        if (i == 2) {
          System.out.println("登录失败,请联系管理员重置密码！");
        } else {
          System.out.println("密码错误，你还有" + (2 - i) + "机会");
        }
      }
    }
  }
}
