package LambdaDemo;

public class Start {
  public static void main(String[] args) {
    // 实现类的方式实现需求
    // MyRunnable my = new MyRunnable();
    // Thread t = new Thread(my);
    // t.start();

    // 匿名内部类的方式
    /*
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("多线程程序启动了！");
      }
    }).start();
     */

    // Lambda表达式的方式改进
    new Thread(() -> {
      System.out.println("多线程程序启动了！");
    }).start();
  }
}
