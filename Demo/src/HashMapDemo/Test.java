package HashMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    HashMap<String, Student> hm = new HashMap<String, Student>();

    Student s1 = new Student("梁又文", 20);
    Student s2 = new Student("梁金俊", 21);
    Student s3 = new Student("杨青青", 22);

    hm.put("001", s1);
    hm.put("002", s2);
    hm.put("003", s3);

    Set<String> keySet = hm.keySet();
    for (String key : keySet) {
      Student value = hm.get(key);
      System.out.println(key + "," + value.getName() + "," + value.getAge());
    }

    System.out.println("------------");

    Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
    for (Map.Entry<String, Student> me : entrySet) {
      String key = me.getKey();
      Student value = me.getValue();
      System.out.println(key + "," + value.getName() + "," + value.getAge());
    }
  }
}
