package HashMapIncludeArrayListDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

    ArrayList<String> arr1 = new ArrayList<String>();
    arr1.add("梁又文");
    arr1.add("梁金俊");
    arr1.add("王煜");

    hashMap.put("001", arr1);

    ArrayList<String> arr2 = new ArrayList<String>();
    arr2.add("梁文文");
    arr2.add("梁金金");
    arr2.add("王煜煜");

    hashMap.put("002", arr2);

    ArrayList<String> arr3 = new ArrayList<String>();
    arr3.add("梁文");
    arr3.add("梁金");
    arr3.add("煜煜");

    hashMap.put("003", arr3);

    Set<String> keySet = hashMap.keySet();
    for (String key : keySet) {
      ArrayList<String> strings = hashMap.get(key);
      for (String name : strings) {
        System.out.println(name);
      }
    }
  }
}
