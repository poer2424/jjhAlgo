import java.util.Scanner;
import java.util.Stack;

/*
    BAEKJOON 17608번 막대기
    https://www.acmicpc.net/problem/17608
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    int count = 1;

    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < N; i++){
      stack.push(scanner.nextInt());
    }
    int maxheight = stack.peek();

    for(int i = 0; i < N; i++) {
      int pop = stack.pop();
      if(pop > maxheight){
        count++;
        maxheight = pop;
      }
    }
    System.out.println(count);
  }
}
