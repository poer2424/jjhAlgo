import java.util.Scanner;

/*
    BAEKJOON 10988번 팰린드롬인지 확인하기
    https://www.acmicpc.net/problem/10988
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    String input = scanner.next();
    int j = input.length();
    for(int i = 0; i < j; i++){
      if(input.charAt(i) != input.charAt(j-1)){
        System.out.println(0);
        return;
      }
      j--;
    }
    System.out.println(1);
  }
}
