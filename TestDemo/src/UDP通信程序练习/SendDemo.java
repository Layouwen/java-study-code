package UDP通信程序练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
  public static void main(String[] args) throws IOException {
    // 创建发送端
    DatagramSocket ds = new DatagramSocket();

    // 键盘录入
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = br.readLine()) != null) {
      // 如果输入000，则退出该程序
      if ("000".equals(line)) {
        break;
      }

      // 创建数据，并打包
      byte[] bys = line.getBytes();
      DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("localhost"), 8888);


      // 发送
      ds.send(dp);
    }

    // 关闭发送端
    ds.close();
  }
}
