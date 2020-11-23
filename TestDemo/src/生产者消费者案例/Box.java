package 生产者消费者案例;

public class Box {
  // 定义奶瓶数量
  private int milk;
  // 定义奶箱状态
  private boolean state = false;

  // 存储和获取方法
  public synchronized void put(int milk) {
    // 如果有牛奶，等待消费
    if (state) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    // 如果没有牛奶，就生产牛奶
    this.milk = milk;
    System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");

    // 生产完毕之后，修改奶箱状态
    state = true;

    // 唤醒
    notifyAll();
  }

  public synchronized void get() {
    // 如果没有牛奶，等待产生
    if (!state) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    // 如果有牛奶，就消费牛奶
    System.out.println("用户拿到第" + this.milk + "瓶奶");

    // 消费完毕之后，修改奶箱状态
    state = false;

    // 唤醒
    notifyAll();
  }
}
