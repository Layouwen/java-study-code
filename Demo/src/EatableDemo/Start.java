package EatableDemo;

public class Start {
  public static void main(String[] args) {
    Eatable e = new EatableImpl();
    useEatable(e);

    // 匿名内部类
    useEatable(new Eatable() {
      @Override
      public void eat() {
        System.out.println("我们要多吃水果！");
      }
    });

    // Lambda表达式
    useEatable(() -> {
      System.out.println("吃不吃关我d事！");
    });
  }

  private static void useEatable(Eatable e) {
    e.eat();
  }
}
