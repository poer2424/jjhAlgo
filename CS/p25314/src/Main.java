import java.util.Scanner;

/*
    BAEKJOON 25314번 코딩은 체육과목 입니다
    https://www.acmicpc.net/problem/25314
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();

    for(int i = 0; i < A/4; i++) {
      System.out.printf("long ");
    }
    System.out.printf("int\n");
  }
}
