import java.util.Scanner;

/*
    BAEKJOON 2525번 오븐 시계
    https://www.acmicpc.net/problem/2525
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();

    int Dh = (B+C)/60;
    int Dm = (B+C)%60;

    if((Dh + A) > 23) {
      System.out.printf("%d %d\n", (Dh + A)%24, Dm);
    }
    else{
      System.out.printf("%d %d\n", (Dh + A), Dm);
    }
  }
}
