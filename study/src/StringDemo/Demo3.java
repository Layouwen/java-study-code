package StringDemo;

public class Demo3 {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4};
    System.out.println(arrToStr(arr));
  }

  public static String arrToStr(int[] arr) {
    String str = "[";
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        str += arr[i];
      } else {
        str += arr[i];
        str += ",";
      }
    }
    str += "]";
    return str;
  }
}

