public class Rabbit {
  public static void main(String[] args) {
    int[] arr = new int[20];
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 2; i < 20; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      System.out.print(',');
    }
    System.out.println();
    System.out.println(arr[19]);
  }
}
