package FlyableDemo;

public class FlyableDemo {
  public static void main(String[] args) {
    useFlyable(new Flyable() {
      @Override
      public void fly(String s) {
        System.out.println("你好呀：" + s);
      }
    });

    System.out.println("---------------------");

    // Lambda
    useFlyable((s) -> {
      System.out.println("你是谁，我是：" + s);
    });
  }

  private static void useFlyable(Flyable f) {
    f.fly("梁又文");
  }
}
