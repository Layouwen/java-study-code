package Demo1;

public class PingPlayer extends Player implements SpeckEnglish {
  public PingPlayer() {
  }

  public PingPlayer(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println("乒乓球学生吃饭");
  }

  @Override
  public void study() {
    System.out.println("乒乓球学生学习");
  }

  @Override
  public void speak() {
    System.out.println("乒乓球学生说英语");
  }
}
