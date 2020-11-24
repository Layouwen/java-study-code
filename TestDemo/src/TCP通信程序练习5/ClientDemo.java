package TCP通信程序练习5;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

/*
 *  客户端：数据来自文件，接收服务器反馈
 *  服务器：接收到的数据写入文本文件，给出反馈
 */
public class ClientDemo {
  public static void main(String[] args) throws IOException {
    Socket s = new Socket("127.0.0.1", 10244);

    BufferedReader br = new BufferedReader(new FileReader("./student-demo.txt"));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

    String line;
    while ((line = br.readLine()) != null) {
      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    // 自定义标记
//    bw.write("886");
//    bw.newLine();
//    bw.flush();
    s.shutdownOutput();


    BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
    String data = brClient.readLine();
    System.out.println("服务器反馈是：" + data);

    br.close();
    s.close();
  }
}
