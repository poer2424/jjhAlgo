import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
    BAEKJOON 1316번 그룹 단어 체커
    https://www.acmicpc.net/problem/1316
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    int count = 0;
    for(int k = 0; k < N; k++){
      int[] alphabet = new int[26];
      String input = scanner.next();
      boolean isGroupWord = true;
      for(int i = 0; i < input.length(); i++){
        char currentChar = input.charAt(i);

        // 이전에 등장한 적 있고, 이전 문자와 다른 문자일 때
        if (alphabet[currentChar - 'a'] > 0 && input.charAt(i - 1) != currentChar) {
          isGroupWord = false;
          break;
        }

        // 현재 문자 등장 횟수 증가
        alphabet[currentChar - 'a']++;
      }
      if(isGroupWord)
        count++;
    }

    System.out.println(count);



  }
}
