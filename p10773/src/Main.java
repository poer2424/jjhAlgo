import java.util.Scanner;
import java.util.Stack;

/*
    BAEKJOON 10773번 제로
    https://www.acmicpc.net/problem/10773
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    Stack<Integer> stack = new Stack<>();
    int sum = 0;
    for(int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      if(a == 0) {
        stack.pop();
        continue;
      }
      stack.push(a);
    }
    for(int i = 0; i < stack.size(); i++) {
      sum+=stack.get(i);
    }
    System.out.println(sum);
  }
}
