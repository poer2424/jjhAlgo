import java.util.Scanner;

/*
    BAEKJOON 2588번 곱셈
    https://www.acmicpc.net/problem/2588
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int Bhun = B / 100;
    int Bten = (B % (100 * Bhun)) / 10;
    int Bone = B % 10;

    System.out.println(A * Bone);
    System.out.println(A * Bten);
    System.out.println(A * Bhun);
    System.out.println(A * B);
  }
}
