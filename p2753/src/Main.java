import java.util.Scanner;

/*
    BAEKJOON 2753번 윤년
    https://www.acmicpc.net/problem/2753
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();

    if(A%400 == 0){
      System.out.println(1);
    } else if(A%4 == 0 && A%100 != 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
