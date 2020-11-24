package TCP通讯程序练习2;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
  public static void main(String[] args) throws IOException {
    // 创建客户端Socket
    Socket s = new Socket("127.0.0.1", 10001);

    // 从键盘录入数据，如果输入的数据为000，则停止发送
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 封装输出流对象
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
    String line;
    while ((line = br.readLine()) != null) {
      if ("000".equals(line)) {
        break;
      }

      // 获取输出流对象
      // OutputStream os = s.getOutputStream();
      // os.write(line.getBytes());

      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    // 释放资源
    s.close();
  }
}
