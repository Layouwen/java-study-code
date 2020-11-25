package LamdaDemo;

public class LambdaDemo {
  public static void main(String[] args) {
    useAddable((int x, int y) -> {
      return x + y;
    });

    useFlyable((s) -> {
      System.out.println(s);
    });

    useFlyable((s) -> System.out.println(s));
  }

  private static void useFlyable(Flyable fly) {
    fly.fly("我是梁又文");
  }

  private static void useAddable(Addable e) {
    int sum = e.add(10, 15);
    System.out.println(sum);
  }
}
