package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<String> ls = new ArrayList<String>();
    ls.add(0, "hello");
    ls.add(1, "world");
    ls.add(2, "ni");
    ls.add(3, "hao");
    System.out.println(ls);

    ls.remove(3);
    ls.set(0, "layouwen");

    System.out.println(ls.get(0));
    System.out.println(ls);
  }
}
