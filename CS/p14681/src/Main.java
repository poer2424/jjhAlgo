import java.util.Scanner;

/*
    BAEKJOON 14681번 사분면 고르기
    https://www.acmicpc.net/problem/14681
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int x = scanner.nextInt();
    int y = scanner.nextInt();

    if(x > 0 && y > 0)
      System.out.println("1");
    else if(x < 0 && y > 0)
      System.out.println("2");
    else if(x < 0 && y < 0)
      System.out.println("3");
    else
      System.out.println("4");
  }
}
