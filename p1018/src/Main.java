import java.util.Arrays;
import java.util.Scanner;

/*
    BAEKJOON 1018번 체스판 다시 칠하기
    https://www.acmicpc.net/problem/1018
*/

public class Main {
  static char[][] chess1 = {{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};

  static char[][] chess2 = {{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int count = 0;
    char[][] array = new char[A][B];

    for (int i = 0; i < A; i++) {
      String temp = scanner.next();
      for (int j = 0; j < B; j++) {
        array[i][j] = temp.charAt(j);
      }
    }

    int min = Integer.MAX_VALUE;

    for (int i = 0; i <= A - 8; i++) {
      for (int j = 0; j <= B - 8; j++) {
        int count1 = 0;
        int count2 = 0;
        for (int k = 0; k < 8; k++) {
          for (int m = 0; m < 8; m++) {
            if (chess1[k][m] != array[i + k][j + m]) {
              count1++;
            }
            if (chess2[k][m] != array[i + k][j + m]) {
              count2++;
            }
          }
        }
        min = Math.min(min, Math.min(count1, count2));
      }
    }

    System.out.println(min);
  }
}
