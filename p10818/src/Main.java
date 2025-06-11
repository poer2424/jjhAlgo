import java.util.Scanner;

/*
    BAEKJOON 10818번 최소, 최대
    https://www.acmicpc.net/problem/10818
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    int[] array = new int[N];

    for(int i = 0; i < N; i++){
      int input = scanner.nextInt();
      array[i] = input;
    }
    int max = array[0];
    int min = array[0];
    for(int i = 0; i < N; i++){
      if(array[i] > max)
        max = array[i];
      else if(array[i] < min)
        min = array[i];
    }

    System.out.printf("%d %d", min, max);
  }
}
