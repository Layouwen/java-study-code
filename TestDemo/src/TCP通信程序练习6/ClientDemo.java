package TCP通信程序练习6;

/*
 * 客户端：数据来自文本文件，接受服务器反馈
 * 服务端：接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程
 */

import java.io.*;
import java.net.Socket;

public class ClientDemo {
  public static void main(String[] args) throws IOException {
    Socket s = new Socket("127.0.0.1", 9898);

    BufferedReader br = new BufferedReader(new FileReader("./student-demo.txt"));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

    String line;
    while ((line = br.readLine()) != null) {
      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    s.shutdownOutput();

    BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
    String data = brClient.readLine();
    System.out.println("服务器的反馈：" + data);

    br.close();
    s.close();
  }
}
