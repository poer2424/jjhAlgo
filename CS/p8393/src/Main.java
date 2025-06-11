import java.util.Scanner;

/*
    BAEKJOON 8393번 합
    https://www.acmicpc.net/problem/8393
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();
    int sum = 0;
    for(int i=1; i<=A; i++){
      sum += i;
    }
    System.out.println(sum);
  }
}
