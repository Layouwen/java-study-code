package RunnableDemo;

public class Start {
  public static void main(String[] args) {
    // 匿名内部类
    startThread(new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName() + "线程启动！");
      }
    });

    startThread(() -> System.out.println(Thread.currentThread().getName() + "线程又启动了！"));
  }

  private static void startThread(Runnable r) {
    new Thread(r).start();
  }
}
