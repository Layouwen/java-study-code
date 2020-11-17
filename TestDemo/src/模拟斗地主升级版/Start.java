package 模拟斗地主升级版;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Start {
  public static void main(String[] args) {
    // 创建HashMap 键是编号 值是牌
    HashMap<Integer, String> hm = new HashMap<Integer, String>();

    // 创建ArrayList 存储编号
    ArrayList<Integer> array = new ArrayList<Integer>();

    // 创建花色数组和点数数组
    String[] colors = {"方块", "梅花", "红心", "黑桃"};
    String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    // 从0开始往HashMap里面存储编号，并存储对应的牌，同时往ArrayList里面存储编号
    int index = 0;

    for (String number : numbers) {
      for (String color : colors) {
        hm.put(index, color + number);
        array.add(index);
        index++;
      }
    }

    hm.put(index, "小王");
    array.add(index);
    index++;
    hm.put(index, "大王");
    array.add(index);

    // 洗牌
    Collections.shuffle(array);

    // 发牌
    TreeSet<Integer> layouwen = new TreeSet<Integer>();
    TreeSet<Integer> lajinjun = new TreeSet<Integer>();
    TreeSet<Integer> wangyu = new TreeSet<Integer>();
    TreeSet<Integer> dp = new TreeSet<Integer>();

    for (int i = 0; i < array.size(); i++) {
      int poker = array.get(i);
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
    lookPoker("梁又文", layouwen, hm);
    lookPoker("梁金俊", lajinjun, hm);
    lookPoker("王煜", wangyu, hm);
    lookPoker("底牌", dp, hm);
  }

  public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
    System.out.println(name + "的牌是：");
    for (Integer key : ts) {
      String poker = hm.get(key);
      System.out.print(poker + " ");
    }
    System.out.println();
  }
}
