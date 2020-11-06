public class Max {
  public static void main(String[] args) {
    int[] arr = {10, 120, 22, 14, 52};
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      max = max > arr[i] ? max : arr[i];
    }
    System.out.println(max);
  }
}