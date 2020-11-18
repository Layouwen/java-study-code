package FileDemo01;

import java.io.File;
import java.io.IOException;

public class Start {
  public static void main(String[] args) throws IOException {
    // 获取路径
    File f1 = new File("/Users/liangyouwen/lyw.txt");
    System.out.println(f1);

    File f2 = new File("/Users/liangyouwen", "lyw.txt");
    System.out.println(f2);

    File f3 = new File("/Users/liangyouwen");
    File f4 = new File(f3, "lyw.txt");
    System.out.println(f4);

    // 创建新文件
    File f5 = new File("/Users/liangyouwen/test.txt");
    System.out.println(f5.createNewFile());

    // 创建一个新目录
    File f6 = new File("/Users/liangyouwen/demo");
    System.out.println(f6.mkdir());

    // 创建一个多级目录
    File f7 = new File("/Users/liangyouwen/demo1/demo2/demo3");
    System.out.println(f7.mkdirs());
  }
}
