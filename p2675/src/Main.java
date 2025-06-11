import java.util.Scanner;

/*
    BAEKJOON 2675번 문자열 반복
    https://www.acmicpc.net/problem/2675
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.
    int N = scanner.nextInt();

    for(int i = 0; i < N; i++){
      int n = scanner.nextInt();
      String input = scanner.next();

      for(int j = 0; j < input.length(); j++){
        for(int k = 0; k < n; k++)
          System.out.print(input.charAt(j));
      }
      System.out.println();
    }
  }
}
