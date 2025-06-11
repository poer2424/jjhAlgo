import java.util.Scanner;

/*
    BAEKJOON 5597번 과제 안 내신 분..?
    https://www.acmicpc.net/problem/5597
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.
    boolean[] checker = new boolean[30];
    for(int i = 0; i < 30; i++)
      checker[i] = false;
    for(int i = 0; i < 28; i++){
      int input = scanner.nextInt();
      checker[input-1] = true;
    }
    for(int i = 0; i < 30; i++){
      if(!checker[i])
        System.out.println(i+1);
    }
  }
}
