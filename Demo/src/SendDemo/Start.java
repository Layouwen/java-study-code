package SendDemo;

import java.io.IOException;
import java.net.*;

public class Start {
  public static void main(String[] args) throws IOException {
    // 创建发送端的Socket对象
    DatagramSocket ds = new DatagramSocket();

    // 创建数据，并打包
    byte[] bys = "我是梁又文".getBytes();
    int length = bys.length;
    InetAddress address = InetAddress.getByName("localhost");
    int port = 1088;
    DatagramPacket db = new DatagramPacket(bys, length, address, port);
    System.out.println(db);

    // 发送数据
    ds.send(db);

    // 关闭发送端
    ds.close();
  }
}
