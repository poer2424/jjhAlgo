import java.util.Scanner;

/*
    BAEKJOON 10798번 세로읽기
    https://www.acmicpc.net/problem/10798
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int[][] array = new int[5][15];

    for(int i = 0; i < 5; i++){
      String str = scanner.nextLine();
      for(int j = 0; j < str.length(); j++){
        array[i][j] = str.charAt(j);
      }
    }

    for(int j = 0; j < 15; j++){
      for(int i= 0; i < 5; i++){
        if(array[i][j] == 0)
          continue;
        System.out.printf("%c", array[i][j]);
      }
    }

  }
}
