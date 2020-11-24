package TCP通信程序练习4;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
  public static void main(String[] args) throws IOException {
    Socket s = new Socket("127.0.0.1", 9998);

    BufferedReader br = new BufferedReader(new FileReader("./osw.txt"));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

    String line;
    while ((line = br.readLine()) != null) {
      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    br.close();
    s.close();
  }
}
