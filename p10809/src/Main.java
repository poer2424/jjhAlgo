import java.util.Scanner;

/*
    BAEKJOON 10809번 알파벳 찾기
    https://www.acmicpc.net/problem/10809
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    String input = scanner.next();
    int[] alphabet = new int[26];

    for(int i = 0; i < 26; i++){
      alphabet[i] = -1;
    }

    for(int i = 0; i < input.length(); i++){
      int x = (int)input.charAt(i) - 97;
      if(alphabet[x] == -1)
        alphabet[x] = i;
    }

    for(int i = 0; i < 26; i++){
      System.out.printf("%d ", alphabet[i]);
    }
    System.out.printf("\n");
  }
}
