package TCP通信程序练习6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(9898);

    while (true) {
      Socket s = ss.accept();

      // 开启线程
      new Thread(new ServerThread(s)).start();
    }
  }
}
