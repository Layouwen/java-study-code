package RiliDemo;

import java.util.Calendar;
import java.util.Scanner;

public class DemoTest {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    Scanner s = new Scanner(System.in);
    int year = s.nextInt();
    c.set(year, 2, 1);
    c.add(Calendar.DATE, -1);
    int date = c.get(Calendar.DATE);
    System.out.println(date);
  }
}
