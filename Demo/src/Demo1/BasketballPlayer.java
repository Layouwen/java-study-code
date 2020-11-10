package Demo1;

public class BasketballPlayer extends Player {
  public BasketballPlayer() {
  }

  public BasketballPlayer(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println("篮球学生吃饭");
  }

  @Override
  public void study() {
    System.out.println("篮球学生学东西");
  }
}
