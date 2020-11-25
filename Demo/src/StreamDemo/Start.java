package StreamDemo;

import java.util.ArrayList;

public class Start {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("梁又文");
    list.add("王煜");
    list.add("杨青青");
    list.add("梁金俊");
    list.add("梁溪");
    list.add("两百");

    for (String s : list) {
      System.out.println(s);
    }

    System.out.println("-----------------");

    ArrayList<String> liangList = new ArrayList<String>();

    for (String s : list) {
      if (s.startsWith("梁")) {
        liangList.add(s);
      }
    }

    for (String s : liangList) {
      System.out.println(s);
    }

    System.out.println("-----------------");

    ArrayList<String> lenList = new ArrayList<String>();

    for (String s : liangList) {
      if (s.length() > 2) {
        lenList.add(s);
      }
    }

    for (String s : lenList) {
      System.out.println(s);
    }

    System.out.println("=================");

//    list.stream().filter(s -> s.startsWith("梁")).filter(s -> s.length() > 2).forEach(s -> System.out.println(s));
    list.stream().filter(s -> s.startsWith("梁")).filter(s -> s.length() > 2).forEach(System.out::println);
  }
}
