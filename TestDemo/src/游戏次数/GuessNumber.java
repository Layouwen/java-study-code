package 游戏次数;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
  private GuessNumber() {

  }

  public static void start() {
    Random r = new Random();
    int number = r.nextInt(100) + 1;

    while (true) {
      // 使用程序实现猜数字，每次均要输如猜测的数字值，需要使用键盘录用实现
      Scanner sc = new Scanner(System.in);

      System.out.println("请输入你要猜的数字：");
      int guessNumber = sc.nextInt();

      // 比较输入的数字和系统产生的数据，需要使用分支语句。这里使用if..else..if..格式，根据情况不同进行猜测结果的显示
      if (guessNumber > number) {
        System.out.println("你猜的数字" + guessNumber + "大了");
      } else if (guessNumber < number) {
        System.out.println("你猜的数字" + guessNumber + "小了");
      } else {
        System.out.println("恭喜你猜对了！");
        break;
      }
    }
  }
}
