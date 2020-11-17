package MapDemo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>();

    map.put("梁又文", "梁金俊");
    map.put("杨青青", "刘涛");
    map.put("刘运长", "王煜");

    Set<Map.Entry<String, String>> entrySet = map.entrySet();

    for (Map.Entry<String, String> item : entrySet) {
      System.out.println(item.getKey() + "," + item.getValue());
    }
  }
}
