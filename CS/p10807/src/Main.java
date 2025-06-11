import java.util.Scanner;

/*
    BAEKJOON 10807번 개수 세기
    https://www.acmicpc.net/problem/10807
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();
    int[] array = new int[A];
    for(int i = 0; i < A; i++){
      int B = scanner.nextInt();
      array[i] = B;
    }
    int C = scanner.nextInt();
    int sum=0;
    for(int i = 0; i < A; i++){
      if(C == array[i])
        sum+=1;
    }
    System.out.printf("%d", sum);
  }
}
