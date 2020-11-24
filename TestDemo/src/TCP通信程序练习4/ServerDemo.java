package TCP通信程序练习4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(9998);

    Socket s = ss.accept();

    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    BufferedWriter bw = new BufferedWriter(new FileWriter("./TCPDemo4.txt"));

    String line;
    while ((line = br.readLine()) != null) {
      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    // 释放资源
    bw.close();
    ss.close();
  }
}
