import java.util.Scanner;

/*
    BAEKJOON 27866번 문자와 문자열
    https://www.acmicpc.net/problem/27866
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    String input = scanner.next();
    int i = scanner.nextInt();

    System.out.printf("%c", input.charAt(i-1));
  }
}
