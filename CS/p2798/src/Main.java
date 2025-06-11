import java.util.Scanner;

/*
    BAEKJOON 2798번 블랙잭
    https://www.acmicpc.net/problem/2798
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    int[] array = new int[N];
    int M = scanner.nextInt();
    for(int i = 0; i < N; i++){
      int n = scanner.nextInt();
      array[i] = n;
    }

    int sum = 0;
    int result = Math.abs((array[0] + array[1] + array[2]) - M);

    for(int i = 0; i < N-2; i++){
      for(int j = i+1; j < N-1; j++){
        for(int k = j+1; k < N; k++){
          sum = array[i] + array[j] + array[k];
          if(sum <= M){
            result = Math.max(sum, result);
          }
        }
      }
    }

    System.out.println(result);

  }
}
