package 集合到文件数据排序改进版;

public class Student {
  private String name;
  private int yuwen;
  private int shuxue;
  private int yingyu;

  public Student() {
  }

  public Student(String name, int yuwen, int shuxue, int yingyu) {
    this.name = name;
    this.yuwen = yuwen;
    this.shuxue = shuxue;
    this.yingyu = yingyu;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYuwen() {
    return yuwen;
  }

  public void setYuwen(int yuwen) {
    this.yuwen = yuwen;
  }

  public int getShuxue() {
    return shuxue;
  }

  public void setShuxue(int shuxut) {
    this.shuxue = shuxut;
  }

  public int getYingyu() {
    return yingyu;
  }

  public void setYingyu(int yingyu) {
    this.yingyu = yingyu;
  }

  public int getSum() {
    return this.yuwen + this.shuxue + this.yingyu;
  }
}
