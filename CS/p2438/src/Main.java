import java.util.Scanner;

/*
    BAEKJOON 2438번 별 찍기 - 1
    https://www.acmicpc.net/problem/2438
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();

    for(int i = 1; i < A+1; i++){
      for(int j = 0; j < i; j++){
        System.out.printf("*");
      }
      System.out.printf("\n");
    }
  }
}
