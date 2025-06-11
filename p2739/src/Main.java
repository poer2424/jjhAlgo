import java.util.Scanner;

/*
    BAEKJOON 2739번 구구단
    https://www.acmicpc.net/problem/2739
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();

    for(int i=0; i<9; i++){
      System.out.printf("%d * %d = %d\n", A, i+1, A*(i+1));
    }
  }
}
