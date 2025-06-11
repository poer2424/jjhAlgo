import java.util.Arrays;
import java.util.Scanner;

/*
    BAEKJOON 2908번 상수
    https://www.acmicpc.net/problem/2908
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    String A = scanner.next();
    String B = scanner.next();

    for(int i = 2; i >= 0; i--){
      if(A.charAt(i) > B.charAt(i)){
        reverse(A);
        break;
      }
      if(B.charAt(i) > A.charAt(i)){
        reverse(B);
        break;
      }
    }
  }

  public static void reverse(String N) {
    String k = "";
    for(int i = 2; i >= 0; i--){
      k += N.charAt(i);
    }
    System.out.println(k);
  }
}
