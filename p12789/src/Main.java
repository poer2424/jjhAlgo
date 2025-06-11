import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/*
    BAEKJOON 12789번 도키도키 간식드리미
    https://www.acmicpc.net/problem/12789
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    Stack<Integer> origin = new Stack<>();
    Stack<Integer> newline = new Stack<>();
    ArrayList<Integer> arrtemp = new ArrayList<>();
    int check = 1;
    int temp;
    for(int i = 0; i < N; i++){
      int input = scanner.nextInt();
      arrtemp.add(input);
    }
    for(int i = arrtemp.size()-1; i >= 0; i--){
      origin.push(arrtemp.get(i));
    }
    while(check <= N) {
      if(origin.isEmpty() && newline.peek() != check) {
        System.out.println("Sad");
        return;
      }
      if(!origin.isEmpty() && origin.peek() == check) {
        origin.pop();
        check++;
        continue;
      }
      if(!newline.isEmpty() && newline.peek() == check) {
        newline.pop();
        check++;
        continue;
      }
      temp = origin.pop();
      newline.push(temp);
    }
    System.out.println("Nice");
  }
}
