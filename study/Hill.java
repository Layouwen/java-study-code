public class Hill {
  public static void main(String[] args) {
    int hill_hight = 8844430;
    double wrapper1 = 0.1;
    double wrapper2 = 0.1;
    int count1 = 0;
    int count2 = 0;
    while (wrapper1 <= hill_hight) {
      wrapper1 *= 2;
      count1++;
    }
    do {
      wrapper2 *= 2;
      count2++;
    } while (wrapper2 <= hill_hight);
    System.out.println(wrapper1 + "and" + count1);
    System.out.println(wrapper2 + "adn" + count2);
  }
}