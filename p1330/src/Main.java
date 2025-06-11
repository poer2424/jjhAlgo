import java.util.Scanner;

/*
    BAEKJOON 1330번 두 수 비교하기
    https://www.acmicpc.net/problem/1330
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    if(A > B) {
      System.out.println(">");
    } else if(A < B) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }
  }
}
