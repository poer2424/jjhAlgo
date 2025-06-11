import java.util.Scanner;

/*
    BAEKJOON 2439번 별 찍기 - 2
    https://www.acmicpc.net/problem/2439
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();

    for(int i = 1; i <= A; i++){
      for(int j = 1; j <= A - i; j++){
        System.out.printf(" ");
      }
      for(int k = 1; k <= i; k++){
        System.out.printf("*");
      }
      System.out.printf("\n");
    }
  }
}
