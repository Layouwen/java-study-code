public class ArrMax {
  public static void main(String[] args) {
    int[] arr1 = {2, 10, 12, 1, 0, 400, 23};
    System.out.println(arrMax(arr1));
  }

  public static int arrMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      max = max > arr[i] ? max : arr[i];
    }
    return max;
  }
}
