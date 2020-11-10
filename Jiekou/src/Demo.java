import java.util.concurrent.Callable;

public class Demo {
  public static void main(String[] args) {
    Jumpping one = new Cat();
    one.jump();
    Animal two = new Cat("layouwen", 20);
    System.out.println(two.getAge() + "," + two.getName());
    Cat three = new Cat("梁又文", 10);
    System.out.println(three.getAge() + "," + three.getName());
    three.jump();
  }
}
