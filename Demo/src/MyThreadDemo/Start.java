package MyThreadDemo;

public class Start {
  public static void main(String[] args) {
    MyThread my1 = new MyThread();
    MyThread my2 = new MyThread();

    my1.start();
    my2.start();
  }
}
