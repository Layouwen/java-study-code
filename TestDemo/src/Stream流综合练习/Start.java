package Stream流综合练习;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Start {
  public static void main(String[] args) {
    ArrayList<String> manList = new ArrayList<String>();
    manList.add("梁金俊");
    manList.add("易烊千玺");
    manList.add("李龙奇");
    manList.add("梁又文");

    ArrayList<String> womanList = new ArrayList<String>();
    womanList.add("李润");
    womanList.add("杨青青");
    womanList.add("郝郡");
    womanList.add("杨幂");
    womanList.add("梁梓");

    // 男演员只要3个字的
    Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);

    // 女演员只要姓"杨"的
    Stream<String> womanStream = womanList.stream().filter(s -> s.startsWith("杨")).skip(1);

    // 合并两个条件的Stream
    Stream<String> stream = Stream.concat(manStream, womanStream);

    // 创建对象
    stream.map(Actor::new).forEach(s -> System.out.println(s.getName()));
  }
}
