import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();

    int range = s.nextInt();
    int guess = r.nextInt(range) + 1;

    int guessInput;

    while (true) {
      guessInput = s.nextInt();
      if (guessInput == guess) {
        System.out.println("恭喜你猜对了，答案是" + guess);
        break;
      } else if (guess > guessInput) {
        System.out.println("太小了");
      } else {
        System.out.println("太大了");
      }
    }
  }
}
