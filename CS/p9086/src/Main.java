import java.util.Scanner;

/*
    BAEKJOON 9086번 문자열
    https://www.acmicpc.net/problem/9086
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    String[] array = new String[N];
    for(int i = 0; i < N; i++){
      array[i] = scanner.next();
    }
    for(int i = 0; i < N; i++){
      System.out.printf("%c%c\n", array[i].charAt(0), array[i].charAt(array[i].length()-1));
    }
  }
}
