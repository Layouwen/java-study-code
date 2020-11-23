package InetAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Start {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress address = InetAddress.getByName("127.0.0.1");

    String name = address.getHostName();
    String ip = address.getHostAddress();

    System.out.println(name);
    System.out.println(ip);
  }
}
