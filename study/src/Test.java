import java.util.HashSet;

public class Test {
  public static void main(String[] args) {
    // HashSet Demo
    HashSet<String> hs = new HashSet<String>();
    hs.add("hello");
    hs.add("two");
    hs.add("hello");
    hs.add("three");
    for(String item : hs){
      System.out.println(item);
    }
  }
}
