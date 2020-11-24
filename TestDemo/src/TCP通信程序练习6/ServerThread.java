package TCP通信程序练习6;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
  private Socket s;

  public ServerThread(Socket s) {
  }

  @Override
  public void run() {
    try {
      // 接收数据写到文件
      BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
      // 解决名称冲突
      int count = 0;
      File file = new File("./TCPDemoCopy[" + count + "].java");
      while (file.exists()) {
        count++;
        file = new File("./TCPDemoCopy[" + count + "].java");
      }
      BufferedWriter bw = new BufferedWriter(new FileWriter(file));

      String line;
      while ((line = br.readLine()) != null) {
        bw.write(line);
        bw.newLine();
        bw.flush();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
