package DiGuiDemo;

public class Start {
  public static void main(String[] args) {
    System.out.println(f(20));
    System.out.println(jc(5));
  }

  public static int f(int n) {
    if (n == 1 || n == 2) {
      return 1;
    } else {
      return f(n - 1) + f(n - 2);
    }
  }

  public static int jc(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * jc(n - 1);
    }
  }
}
