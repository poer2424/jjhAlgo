import java.util.Scanner;

/*
    BAEKJOON 2738번 행렬 덧셈
    https://www.acmicpc.net/problem/2738
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int[][] array1 = new int[N][M];
    int[][] array2 = new int[N][M];

    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        array1[i][j] = scanner.nextInt();
      }

    }

    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        array2[i][j] = scanner.nextInt();
      }
    }

    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        System.out.printf("%d ", array1[i][j] + array2[i][j]);
      }
      System.out.println();
    }
  }
}
