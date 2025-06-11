import java.util.Scanner;

/*
    BAEKJOON 2566번 최댓값
    https://www.acmicpc.net/problem/2566
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int[][] array = new int[9][9];
    int max = 0;
    int maxindX = 0;
    int maxindY = 0;
    for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
        array[i][j] = scanner.nextInt();
      }
    }

    for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
        if(array[i][j] > max){
          max = array[i][j];
          maxindX = i;
          maxindY = j;
        }
      }
    }
    System.out.println(max);
    System.out.printf("%d %d\n", maxindX+1, maxindY+1);
  }
}
