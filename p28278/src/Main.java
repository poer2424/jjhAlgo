import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

/*
    BAEKJOON 28278번 스택 2
    https://www.acmicpc.net/problem/28278
*/

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    Stack<Integer> stack = new Stack<>();
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int k = 0;
    int j = 0;
    for(int i = 0; i < N; i++){
      k = scanner.nextInt();
      if(k == 1){
        j = scanner.nextInt();
        stack.push(j);
      }
      else if(k == 2){
        if(stack.empty())
          bw.write(-1+"\n");
        else
          bw.write(stack.pop()+"\n");
      }
      else if(k == 3){
        bw.write(stack.size()+"\n");
      }
      else if(k == 4){
        if(stack.empty())
          bw.write(1+"\n");
        else
          bw.write(0+"\n");
      }
      else if(k == 5){
        if(stack.empty())
          bw.write(-1+"\n");
        else
          bw.write(stack.peek()+"\n");
      }
    }
    bw.flush();
    bw.close();
  }
}
