package PropertiesDemo01;

import java.util.Properties;
import java.util.Set;

public class Start {
  public static void main(String[] args) {
Properties prop = new Properties();

prop.put("1001", "梁又文");
prop.put("1002", "梁金俊");
prop.put("1003", "王煜");

Set<Object> keySet = prop.keySet();
for (Object key : keySet) {
  Object value = prop.get(key);
  System.out.println(key + "," + value);
}
  }
}
