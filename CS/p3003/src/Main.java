import java.util.ArrayList;
import java.util.Scanner;

/*
    BAEKJOON 3003번 킹, 퀸, 룩, 비숍, 나이트, 폰
    https://www.acmicpc.net/problem/3003
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int[] chess = new int[6];
    int[] index = new int[]{0,0,0,0,0,0};

    for(int i = 0; i < 6; i++){
      chess[i] = scanner.nextInt();
    }

    for(int i = 0; i < 2; i++){
      while(chess[i] > 1){
        chess[i]--;
        index[i]--;
      }
      while(chess[i] < 1){
        chess[i]++;
        index[i]++;
      }
    }

    for(int i = 2; i < 5; i++){
      while(chess[i] > 2){
        chess[i]--;
        index[i]--;
      }
      while(chess[i] < 2){
        chess[i]++;
        index[i]++;
      }
    }

    while(chess[5] > 8){
      chess[5]--;
      index[5]--;
    }
    while(chess[5] < 8){
      chess[5]++;
      index[5]++;
    }

    for(int i = 0; i < 6; i++){
      System.out.printf("%d ", index[i]);
    }

  }
}
