
import java.util.Scanner;

/*
    BAEKJOON 2884번 알람 시계
    https://www.acmicpc.net/problem/2884
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();
    int B = scanner.nextInt();


    if(A > 0){
      if(B >= 45){
        System.out.printf("%d %d\n", A, B-45);
      }
      else{
        int C = Math.abs(B-45);
        System.out.printf("%d %d\n", A-1, 60-C);
      }
    }
    else{
      if(B >= 45){
        System.out.printf("%d %d\n", A, B-45);
      }
      else{
        int C = Math.abs(B-45);
        System.out.printf("23 %d\n", 60-C);
      }
    }
  }
}
