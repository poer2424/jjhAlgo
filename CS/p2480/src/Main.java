import java.util.Scanner;

/*
    BAEKJOON 2480번 주사위 세개
    https://www.acmicpc.net/problem/2480
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();

    if(A == B && B == C){
      System.out.printf("%d\n", 10000+A*1000);
    }
    else if(A != B && B != C && A != C){
      System.out.printf("%d\n", 100*findMax(A,B,C));
    }
    else{
      if(A==B){
        System.out.printf("%d\n", 1000+A*100);
      }
      if(A==C){
        System.out.printf("%d\n", 1000+A*100);
      }
      if(C==B){
        System.out.printf("%d\n", 1000+C*100);
      }
    }
  }

  public static int findMax(int a, int b, int c){
    int max = a;

    if(b > max){
      max = b;
    }
    if(c > max){
      max = c;
    }

    return max;
  }
}
