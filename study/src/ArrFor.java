public class ArrFor {
  public static void main(String[] args) {
    int[] arr1 = {2, 8, 12, 1, 0};
    printArray(arr1);
  }

  public static void printArray(int[] arr) {
    System.out.print('[');
    for (int i = 0; i < arr.length; i++) {
      if (i != arr.length - 1) {
        System.out.print(arr[i] + ", ");
      } else {
        System.out.print(arr[i]);
      }
    }
    System.out.print(']');
  }
}
