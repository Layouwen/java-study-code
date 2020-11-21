package PropertiesDemo03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Start {
  public static void main(String[] args) throws IOException {
    // 把集合的数据保存到文件中
    myStore();

    // 把文件的数据加载到集合中
    myLoad();
  }

  private static void myLoad() throws IOException {
    Properties prop = new Properties();

    FileReader fr = new FileReader("./PropertiesDemo03.txt");
    prop.load(fr);
    fr.close();

    System.out.println(prop);
  }

  private static void myStore() throws IOException {
    Properties prop = new Properties();

    prop.setProperty("3001", "梁又文");
    prop.setProperty("3002", "梁金俊");
    prop.setProperty("3003", "王煜");

    FileWriter fw = new FileWriter("./PropertiesDemo03.txt");
    prop.store(fw, null);
    fw.close();
  }
}
