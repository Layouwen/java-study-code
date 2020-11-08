public class SumDemo1 {
  public static void main(String[] args) {
    int[] arr1 = {68, 27, 95, 88, 171, 996, 51, 210};
    int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] % 10 != 7 && arr1[i] / 10 % 10 != 7 && arr1[i] % 2 == 0) {
        sum += arr1[i];
      }
    }
    System.out.println(sum);
  }
}
