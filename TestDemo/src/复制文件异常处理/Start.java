package 复制文件异常处理;

import java.io.*;
import java.lang.reflect.WildcardType;

public class Start {
  public static void main(String[] args) {

  }

  // 方法1 直接抛出错误
  private static void method1() throws IOException {
    FileReader fr = new FileReader("./test.txt");
    FileWriter fw = new FileWriter("./test-copy.txt");

    char[] chs = new char[1024];
    int len;
    while ((len = fr.read()) != -1) {
      fw.write(chs, 0, len);
    }

    fw.close();
    fr.close();
  }

  // 方法2 使用try catch
  private static void method2() {
    FileReader fr = null;
    FileWriter fw = null;
    try {
      fr = new FileReader("./test.txt");
      fw = new FileWriter("./test.txt");

      char[] chs = new char[1024];
      int len;
      while ((len = fr.read()) != -1) {
        fw.write(chs, 0, len);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (fr != null) {
        try {
          fr.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  // 方法3 JDK7的改进方案
  private static void method3() {
    try (FileReader fr = new FileReader("./test.txt");
         FileWriter fw = new FileWriter("./test.txt");) {
      char[] chs = new char[1024];
      int len;
      while ((len = fr.read()) != -1) {
        fw.write(chs, 0, len);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // 方法4 JDK9的改进方案
  private static void method4() throws IOException {
    FileReader fr = new FileReader("./test.txt");
    FileWriter fw = new FileWriter("./test.txt");
    try (fr; fw) {
      char[] chs = new char[1024];
      int len;
      while ((len = fr.read()) != -1) {
        fw.write(chs, 0, len);
      }
    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
