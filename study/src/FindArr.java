import java.util.Scanner;

public class FindArr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {2, 123, 4234, 534, 34, 69, 90};
    int number = sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == number) {
        System.out.println(i);
        break;
      }
    }
  }
}
