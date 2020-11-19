package 复制Java文件增强;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Start {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("./copy-java.txt");
    FileWriter fw = new FileWriter("./copy-java-copy.txt");

    // 读写数据，复制文件
//    int ch;
//    while ((ch = fr.read()) != -1) {
//      fw.write(ch);
//    }

    char[] chs = new char[1024];
    int len;
    while ((len = fr.read()) != 1) {
      fw.write(chs, 0, len);
    }

    fw.close();
    fr.close();
  }
}
