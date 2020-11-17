package 模拟斗地主;

import java.util.ArrayList;
import java.util.Collections;

public class Start {
  public static void main(String[] args) {
    // 创建牌盒
    ArrayList<String> array = new ArrayList<String>();

    // 装牌
    // 定义花色
    String[] colors = {"方块", "梅花", "红心", "黑桃"};
    // 定义点数
    String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    for (String color : colors) {
      for (String number : numbers) {
        array.add(color + number);
      }
    }
    array.add("大王");
    array.add("小王");

    // 洗牌
    Collections.shuffle(array);

    // 发牌
    ArrayList<String> layouwen = new ArrayList<String>();
    ArrayList<String> lajinjun = new ArrayList<String>();
    ArrayList<String> wangyu = new ArrayList<String>();
    ArrayList<String> dp = new ArrayList<String>();

    for (int i = 0; i < array.size(); i++) {
      String poker = array.get(i);
      if (i >= array.size() - 3) {
        dp.add(poker);
      } else if (i % 3 == 0) {
        layouwen.add(poker);
      } else if (i % 3 == 1) {
        lajinjun.add(poker);
      } else if (i % 3 == 2) {
        wangyu.add(poker);
      }
    }

    // 看牌
    lookPoker("梁又文", layouwen);
    lookPoker("梁金俊", lajinjun);
    lookPoker("王煜", wangyu);
    lookPoker("底牌", dp);

  }

  public static void lookPoker(String name, ArrayList<String> array) {
    System.out.println(name + "的牌是：");
    for (String poker : array) {
      System.out.print(poker + " ");
    }
    System.out.println();
  }
}
