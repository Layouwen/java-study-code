package StringSort;

import java.util.Arrays;

public class DemoTest {
  public static void main(String[] args) {
    String str = "9 29 2 39 423 34 8";

    String[] strArr = str.split(" ");

    int[] arr = new int[strArr.length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(strArr[i]);
    }

    Arrays.sort(arr);

    StringBuilder s = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        s.append(arr[i]);
      } else {
        s.append(arr[i]).append(" ");
      }
    }

    System.out.println(s);
  }
}
