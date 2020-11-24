package TCP通信程序练习3;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
  public static void main(String[] args) throws IOException {
    // 创建客户端
    Socket s = new Socket("127.0.0.1", 9999);

    // 键盘录入
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 封装输出流对象
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
    String line;
    while ((line = br.readLine()) != null) {
      if ("999".equals(line)) {
        break;
      }
      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    // 释放资源
    s.close();
  }
}
