import java.util.Scanner;

/*
    BAEKJOON 1152번 단어의 개수
    https://www.acmicpc.net/problem/1152
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.
    int sum = 0;
    String input = scanner.nextLine();

    if (input.charAt(0) != ' ') {
      sum++;
    }
    for(int i = 0; i < input.length()-1; i++){
      if(input.charAt(i) == ' ' && input.charAt(i+1) != ' ')
        sum++;
    }

    System.out.print(sum);
  }
}
