package 统计字符串中每个字符出现的次数;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Start {
  public static void main(String[] args) {
    // 键盘输入
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个字符串");
    String line = sc.nextLine();

    // 创建HashMap
    TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();

    for (int i = 0; i < line.length(); i++) {
      // 获得该字符串的字符
      char key = line.charAt(i);

      // 获取该字符串对应的值
      Integer value = hm.get(key);

      /*
       * 判断是否为空
       * 为空则设置为 key: 1
       * 不为空则设置为 key: 1++
       * */
      if (value == null) {
        hm.put(key, 1);
      } else {
        value++;
        hm.put(key, value);
      }
    }


    StringBuilder sb = new StringBuilder();

    // 获取所有键集合
    Set<Character> keySet = hm.keySet();
    // 遍历键集合
    for (Character key : keySet) {
      // 获取对应key的值
      Integer value = hm.get(key);
      // 格式化输出
      sb.append(key).append("(").append(value).append(")");
    }

    // 输出结果
    String result = sb.toString();
    System.out.println(result);
  }
}
