import java.util.Scanner;
import java.util.Stack;

/*
    BAEKJOON 12605번 단어순서 뒤집기
    https://www.acmicpc.net/problem/12605
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = Integer.parseInt(scanner.nextLine());
    for(int i = 0; i < N; i++){
      Stack<String> stack = new Stack<>();
      String s = scanner.nextLine();
      String[] words = s.split(" ");
        for (String word : words) {
            stack.push(word);
        }
      System.out.printf("Case #%d: ", i+1);
      while(!stack.isEmpty()){
        System.out.printf("%s ", stack.pop());
      }
    }
  }
}
