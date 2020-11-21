package ObjectOutputStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Start {
  public static void main(String[] args) throws IOException {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./oos-demo1.txt"));

    Student s = new Student("梁又文", 20);

    oos.writeObject(s);

    oos.close();
  }
}
