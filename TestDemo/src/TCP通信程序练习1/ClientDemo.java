package TCP通信程序练习1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
  public static void main(String[] args) throws IOException {
    // 创建客户端的Socket
    Socket s = new Socket("127.0.0.1", 9999);

    // 获取输出流，写数据
    OutputStream os = s.getOutputStream();
    os.write("我是梁又文，我又来了：".getBytes());

    // 接收服务器反馈
    InputStream is = s.getInputStream();
    byte[] bys = new byte[1024];
    int len = is.read(bys);
    String data = new String(bys, 0, len);
    System.out.println("客户端：" + data);

    // 释放资源
    s.close();
  }
}
