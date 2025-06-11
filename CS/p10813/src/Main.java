import java.util.Scanner;

/*
    BAEKJOON 10813번 공 바꾸기
    https://www.acmicpc.net/problem/10813
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] basket = new int[N];
    for(int i = 0; i < N; i++){
      basket[i] = i+1;
    }

    for(int i = 0; i < M; i++){
      int first_basket = scanner.nextInt();
      int last_basket = scanner.nextInt();

      int temp = basket[last_basket-1];
      basket[last_basket-1] = basket[first_basket-1];
      basket[first_basket-1] = temp;

    }
    for(int i = 0; i < N; i++){
      System.out.printf("%d ", basket[i]);
    }
    System.out.printf("\n");
  }
}
