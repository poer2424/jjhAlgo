import java.util.Scanner;

/*
    BAEKJOON 10869번 사칙연산
    https://www.acmicpc.net/problem/10869
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    System.out.println(A+B);
    System.out.println(A-B);
    System.out.println(A*B);
    System.out.println(A/B);
    System.out.println(A%B);
  }
}
