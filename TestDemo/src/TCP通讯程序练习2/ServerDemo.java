package TCP通讯程序练习2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
  public static void main(String[] args) throws IOException {
    // 创建服务器Socket对象
    ServerSocket ss = new ServerSocket(10001);

    // 监听客户端的连接，返回一个对应的Socket对象
    Socket s = ss.accept();

    // 获取输入流
    // InputStream is = s.getInputStream();
    // InputStreamReader isr = new InputStreamReader(is);
    // BufferedReader br = new BufferedReader(isr);
    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    String line;
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }

    // 释放资源
    ss.close();
  }
}
