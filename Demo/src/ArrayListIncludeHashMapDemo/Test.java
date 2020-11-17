package ArrayListIncludeHashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    ArrayList<HashMap<String, String>> array = new ArrayList<>();

    HashMap<String, String> hm1 = new HashMap<String, String>();
    hm1.put("孙策", "大乔");
    hm1.put("周瑜", "小乔");
    array.add(hm1);

    HashMap<String, String> hm2 = new HashMap<String, String>();
    hm2.put("郭靖", "黄蓉");
    hm2.put("杨过", "小龙女");
    array.add(hm2);

    HashMap<String, String> hm3 = new HashMap<String, String>();
    hm3.put("令狐冲", "任盈盈");
    hm3.put("林平之", "岳灵珊");
    array.add(hm3);

    for (HashMap<String, String> hm : array) {
      Set<String> keySet = hm.keySet();
      for (String key : keySet) {
        String value = hm.get(key);
        System.out.println(key + "," + value);
      }
    }
  }
}
