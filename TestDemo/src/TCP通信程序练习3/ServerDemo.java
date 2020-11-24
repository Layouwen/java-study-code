package TCP通信程序练习3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
  public static void main(String[] args) throws IOException {
    // 创建服务端
    ServerSocket ss = new ServerSocket(9999);

    // 监听客户数据
    Socket s = ss.accept();

    // 接收数据
    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    // 写入文本文件
    BufferedWriter bw = new BufferedWriter(new FileWriter("./ServerWrite.txt"));

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
