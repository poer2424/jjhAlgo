import java.util.Scanner;

/*
    BAEKJOON 2563번 색종이
    https://www.acmicpc.net/problem/2563
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    boolean[][] array = new boolean[100][100];

    int N = scanner.nextInt();
    for(int k = 0; k < N; k++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      for(int i = y; i < y + 10; i++){
        for(int j = x; j < x + 10; j++){
          array[j][i] = true;
        }
      }
    }
    int count = 0;
    for(int i = 0; i < 100; i++){
      for(int j = 0; j < 100; j++){
        if(array[i][j])
          count++;
      }
    }

    System.out.println(count);


  }
}
