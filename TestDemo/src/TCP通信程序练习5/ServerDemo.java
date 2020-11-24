package TCP通信程序练习5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(10244);

    Socket s = ss.accept();

    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    BufferedWriter bw = new BufferedWriter(new FileWriter("./TCPDemo5.txt"));

    String line;
    while ((line = br.readLine()) != null) {
//      if ("886".equals(line)) {
//        break;
//      }
      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
    bwServer.write("文件上传成功");
    bwServer.newLine();
    bwServer.flush();

    bw.close();
    ss.close();
  }
}
