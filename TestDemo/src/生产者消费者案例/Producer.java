package 生产者消费者案例;

public class Producer implements Runnable {
  private Box b;

  public Producer(Box b) {
    this.b = b;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 300; i++) {
      b.put(i);
    }
  }
}
