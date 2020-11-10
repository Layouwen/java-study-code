package Demo1;

public class DemoMain {
  public static void main(String[] args) {
    BasketballCoach coach1 = new BasketballCoach();
    coach1.setAge(20);
    coach1.setName("篮球教练");
    System.out.println(coach1.getName() + ',' + coach1.getAge());
    coach1.eat();
    coach1.teach();

    BasketballPlayer stu1 = new BasketballPlayer();
    stu1.setAge(19);
    stu1.setName("篮球学生");
    System.out.println(stu1.getName() + stu1.getAge());
    stu1.eat();
    stu1.study();

    PingCoach coach2 = new PingCoach();
    coach2.setAge(22);
    coach2.setName("乒乓球教练");
    System.out.println(coach2.getName() + "," + coach2.getAge());
    coach2.eat();
    coach2.teach();
    coach2.speak();

    PingPlayer stu2 = new PingPlayer();
    stu2.setAge(21);
    stu2.setName("乒乓球学生");
    System.out.println(stu2.getName() + "," + stu2.getAge());
    stu2.eat();
    stu2.study();
    stu2.speak();

  }
}
