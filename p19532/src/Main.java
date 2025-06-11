import java.util.Scanner;

/*
    BAEKJOON 19532번 수학은 비대면강의입니다
    https://www.acmicpc.net/problem/19532
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    int e = scanner.nextInt();
    int f = scanner.nextInt();

    int x = (f * b - e * c) /(d*b-e*a);
    int y = (f*a-d*c)/(e*a-d*b);



    System.out.printf("%d %d", x, y);
    // 코드를 작성하세요.
  }
}
