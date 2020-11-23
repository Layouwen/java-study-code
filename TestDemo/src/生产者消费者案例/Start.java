package 生产者消费者案例;

public class Start {
  public static void main(String[] args) {
    // 创建箱子
    Box b = new Box();

    // 创建生产者和消费者
    Producer p = new Producer(b);
    Customer c = new Customer(b);

    // 创建线程
    Thread t1 = new Thread(p);
    Thread t2 = new Thread(c);

    // 启动线程
    t1.start();
    t2.start();
  }
}
