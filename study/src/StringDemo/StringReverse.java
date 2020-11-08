package StringDemo;

public class StringReverse {
  public static void main(String[] args) {
    String str = "1231231";
    System.out.println(reverse(str));
  }

  public static String reverse(String str) {
    String newStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      newStr += str.charAt(i);
    }
    return newStr;
  }
}
