public class mostHeight {
  public static void main(String[] args) {
    int h1 = 180;
    int h2 = 140;
    int h3 = 210;
    int temp = h1 > h2 ? h1 : h2;
    int height = temp > h3 ? temp : h3;
    System.out.println(height);
  }
}