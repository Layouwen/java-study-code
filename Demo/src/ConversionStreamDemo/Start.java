package ConversionStreamDemo;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Start {

  public static void main(String[] args) throws IOException {
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./osw.txt"),"GBK");
    osw.write("梁又文");
    osw.close();

    InputStreamReader isr = new InputStreamReader(new FileInputStream("./osw.txt"),"GBK");

    int ch;
    while ((ch=isr.read())!=-1){
      System.out.print((char)ch);
    }

    isr.close();
  }
}
