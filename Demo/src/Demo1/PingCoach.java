package Demo1;

public class PingCoach extends Coach implements SpeckEnglish {
  public PingCoach() {
  }

  public PingCoach(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println("乒乓球教练吃饭");
  }

  @Override
  public void teach() {
    System.out.println("乒乓球教练教东西");
  }

  @Override
  public void speak() {
    System.out.println("乒乓球教练说英语");
  }
}
