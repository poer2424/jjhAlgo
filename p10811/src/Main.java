import java.util.Scanner;

/*
    BAEKJOON 10811번 바구니 뒤집기
    https://www.acmicpc.net/problem/10811
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int[] array = new int[N];

    for(int i = 0; i < N; i++){
      array[i] = i+1;
    }

    for(int i = 0; i < M; i++){
      int first = scanner.nextInt();
      int last = scanner.nextInt();

      for(int j = first; j < last; j++){
        swap(array, j-1, last-1);
        last--;
      }
    }

    for(int i = 0; i < N; i++){
      System.out.printf("%d ", array[i]);
    }
    System.out.printf("\n");
  }

  public static void swap(int[] array, int x, int y) {
    if(x == y)
      return;
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}
