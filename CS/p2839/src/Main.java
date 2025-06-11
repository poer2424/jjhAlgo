import java.util.Scanner;

/*
    BAEKJOON 2839번 설탕 배달
    https://www.acmicpc.net/problem/2839
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    int p = 0;
    if(N % 5 == 0){
      System.out.println(N/5);
      return;
    }
    else{
      while(N > 0){
        N-=3;
        p++;
        if(N % 5 == 0){
          p = p + N/5;
          System.out.println(p);
          break;
        }
        else if(N == 1 || N == 2){
          System.out.println(-1);
          break;
        }
        else if(N == 0){
          System.out.println(p);
          break;
        }
      }
    }
  }
}
