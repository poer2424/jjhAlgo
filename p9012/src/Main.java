import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = Integer.parseInt(scanner.nextLine());

    for(int i = 0; i < N; i++){
      String s = scanner.nextLine();
      Stack<Character> stack = new Stack<>();
      boolean isBalanced = true;

      for(int j = 0; j < s.length(); j++){
        char ch = s.charAt(j);
        if(ch == '(') {
          stack.push(ch);
        } else if(ch == ')') {
          if(stack.isEmpty() || stack.pop() != '(') {
            isBalanced = false;
            break;
          }
        }
      }

      if(!stack.isEmpty() || !isBalanced) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }
    }
  }
}
