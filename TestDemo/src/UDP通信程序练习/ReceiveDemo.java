package UDP通信程序练习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
  public static void main(String[] args) throws IOException {
    // 创建接收端对象
    DatagramSocket ds = new DatagramSocket(8888);

    while (true) {
      // 创建数据包，用于接收数据
      byte[] bys = new byte[1024];
      DatagramPacket dp = new DatagramPacket(bys, bys.length);

      // 接收数据
      ds.receive(dp);

      // 解析数据包
      System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
    }

  }
}
