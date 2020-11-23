package 卖票;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
  private int tickets = 100;
  private Object obj = new Object();
  private Lock lock = new ReentrantLock();

  @Override
  public void run() {
    while (true) {
      lock.lock();
      if (tickets > 0) {
        synchronized (obj) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
          tickets--;
        }
      }
      lock.unlock();
    }
  }
}
