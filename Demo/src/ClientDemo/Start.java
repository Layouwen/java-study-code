package ClientDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Start {
  public static void main(String[] args) throws IOException {
    // 创建客户端的Socket对象
    // Socket s = new Socket(InetAddress.getByName("127.0.0.1"), 8888);
    Socket s = new Socket("127.0.0.1", 8888);

    // 获取输出流，写数据
    OutputStream os = s.getOutputStream();
    os.write("我是梁又文，我来了".getBytes());

    // 释放数据
    s.close();
  }
}
