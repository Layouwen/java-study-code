package StringDemo;

import java.util.Scanner;

public class Demo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int big = 0;
    int small = 0;
    int number = 0;

    System.out.println("输入字符串");
    String line = sc.nextLine();

    for (int i = 0; i < line.length(); i++) {
      char ch = line.charAt(i);
      if (ch >= 'A' && ch <= 'Z') {
        big++;
      } else if (ch >= 'a' && ch <= 'z') {
        small++;
      } else if (ch >= '0' && ch <= '9') {
        number++;
      }
    }
    System.out.println(big + "," + small + "," + number);
  }
}
