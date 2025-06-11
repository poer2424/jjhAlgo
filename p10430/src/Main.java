import java.util.Scanner;

/*
    BAEKJOON 10430번 나머지
    https://www.acmicpc.net/problem/10430
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();

    System.out.println((A+B)%C);
    System.out.println(((A%C) + (B%C))%C);
    System.out.println((A*B)%C);
    System.out.println(((A%C) * (B%C))%C);
  }
}
