package FileOutputStreamDemo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Start {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("test.txt");

    fos.write(55);
    fos.write(57);
    fos.write(101);

    fos.close();

    FileInputStream readFile = new FileInputStream("test.txt");

    int by;
    while ((by = readFile.read()) != -1) {
      System.out.print((char) by);
    }

  }
}
