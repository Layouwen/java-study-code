public class ReverseArr {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    forEachArr(arr);
  }

  public static void forEachArr(int[] arr) {
    System.out.print('[');
    for (int i = 0; i < arr.length; i++) {
      if (arr.length - 1 != i) {
        System.out.print(arr[i] + ", ");
      } else {
        System.out.print(arr[i]);
      }
    }
    System.out.println(']');
  }
}
