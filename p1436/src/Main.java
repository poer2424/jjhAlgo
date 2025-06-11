import java.util.Scanner;

/*
    BAEKJOON 1436번 영화감독 숌
    https://www.acmicpc.net/problem/1436
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int cnt = 0;
    int k = 1;
    while(true){
      String i = Integer.toString(k);
      if(i.contains("666"))
        cnt++;
      if(cnt == N)
        break;
      else{
        k++;
      }
    }

    System.out.println(k);
    // 코드를 작성하세요.
  }
}
