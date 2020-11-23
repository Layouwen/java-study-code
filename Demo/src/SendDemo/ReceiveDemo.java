package SendDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
  public static void main(String[] args) throws IOException {
    // 创建接收端
    DatagramSocket ds = new DatagramSocket(1088);

    // 创建一个数据包
    byte[] bys = new byte[1024];
    DatagramPacket dp = new DatagramPacket(bys, bys.length);


    // 接收数据
    ds.receive(dp);

    // 解析数据
    byte[] datas = dp.getData();
    int len = dp.getLength();
    String dataString = new String(datas, 0, len);
    System.out.println("数据是：" + dataString);

    // 关闭接收端
    ds.close();
  }
}
