package BufferedStreamDemo01;

import java.io.*;

public class Start {
  public static void main(String[] args) throws IOException {

//    BufferedWriter bw = new BufferedWriter(new FileWriter("./Buffered.txt"));
//
//    bw.write("layouwen\r");
//    bw.write("liangjinjun");
//
//    bw.close();

    // 一次读一个字符数据
    BufferedReader br = new BufferedReader(new FileReader("./Buffered.txt"));

//    int ch;
//    while ((ch = br.read()) != -1) {
//      System.out.print((char) ch);
//    }

    // 一次读一个字符数组数据

    br.close();
  }
}
