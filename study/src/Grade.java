public class Grade {
  public static void main(String[] args) {
    int[] arr = {99, 96, 98, 95, 98, 96};
    int sum = sum(arr) - min(arr) - max(arr);
    System.out.println(sum / (arr.length - 2));
  }

  public static int max(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) max = arr[i];
    }
    return max;
  }

  public static int min(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) min = arr[i];
    }
    return min;
  }

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
}
