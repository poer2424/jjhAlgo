import java.util.Scanner;

/*
    BAEKJOON 1546번 평균
    https://www.acmicpc.net/problem/1546
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.
    float sum = 0;
    int N = scanner.nextInt();
    int array[] = new int[N];
    for(int i = 0; i < N; i++){
      array[i] = scanner.nextInt();
    }
    int max = max(array, N);

    for(int i = 0; i < N; i++){
      float x = (float) array[i] / max * 100;
      sum += x;
    }

    System.out.printf("%f", sum/N);
  }

  public static int max(int[] array, int n) {
    int max = array[0];
    for(int i = 1; i < n; i++){
      if(array[i] > max)
        max = array[i];
    }
    return max;
  }
}
