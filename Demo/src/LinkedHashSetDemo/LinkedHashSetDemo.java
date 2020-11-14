package LinkedHashSetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
  public static void main(String[] args) {
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();

    lhs.add("layouwen");
    lhs.add("liangjinjun");
    lhs.add("yqq");
    lhs.add("yqq");

    for (String item : lhs) {
      System.out.println(item);
    }
  }
}
