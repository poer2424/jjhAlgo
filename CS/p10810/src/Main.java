import java.util.Scanner;

/*
    BAEKJOON 10810번 공 넣기
    https://www.acmicpc.net/problem/10810
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] basket = new int[N];
    for(int i = 0; i < N; i++){
      basket[i] = 0;
    }
    for(int i = 0; i < M; i++){
      int first_basket = scanner.nextInt();
      int last_basket = scanner.nextInt();
      int ball = scanner.nextInt();
      for(int j = first_basket-1; j < last_basket; j++){
        basket[j] = ball;
      }
    }
    for(int i = 0; i < N; i++){
      System.out.printf("%d ", basket[i]);
    }
    System.out.printf("\n");
  }
}
