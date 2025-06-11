import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String input = scanner.nextLine();
      if (input.equals(".")) {
        break; // 종료 조건
      }

      if (isBalanced(input)) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
    scanner.close();
  }

  private static boolean isBalanced(String input) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (c == '(' || c == '[') {
        stack.push(c); // 열린 괄호 스택에 추가
      } else if (c == ')') {
        if (stack.isEmpty() || stack.peek() != '(') {
          return false; // 짝이 맞지 않음
        }
        stack.pop(); // 짝이 맞으면 제거
      } else if (c == ']') {
        if (stack.isEmpty() || stack.peek() != '[') {
          return false; // 짝이 맞지 않음
        }
        stack.pop(); // 짝이 맞으면 제거
      }
    }

    return stack.isEmpty(); // 스택이 비어 있어야 균형잡힌 문자열
  }
}
