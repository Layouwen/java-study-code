package 游戏次数;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Start {
  public static void main(String[] args) throws IOException {
    // 从文件中读取数据到Properties集合，用Load()方法实现
    Properties prop = new Properties();

    FileReader fr = new FileReader("./game.txt");
    prop.load(fr);
    fr.close();

    // 通过Properties集合获取到玩游戏的次数
    String count = prop.getProperty("count");
    int number = Integer.parseInt(count);

    // 判断次数是否到3次了
    if (number >= 3) {
      // 玩游戏
      System.out.println("游戏试玩已结束，请明天再试！");
    } else {
      GuessNumber.start();

      // 次数+1，重新写回文件，用Properties的store()方法实现
      number++;
      prop.setProperty("count", String.valueOf(number));
      FileWriter fw = new FileWriter("./game.txt");
      prop.store(fw, null);
      fw.close();
    }
  }
}
