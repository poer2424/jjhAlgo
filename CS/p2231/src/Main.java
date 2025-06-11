import java.util.Scanner;

/*
    BAEKJOON 2231번 분해합
    https://www.acmicpc.net/problem/2231
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();

    for(int i = 1; i <= N; i++){
      int m = i;
      int sum = i;
      int temp;
      while(m/10 > 0){
        temp = m/10;
        sum+=m%10;
        m = temp;
      }
      sum+=m;

      if(sum == N){
        System.out.println(i);
        return;
      }
    }

    System.out.println(0);

  }
}
