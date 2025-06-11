
import java.util.ArrayList;
import java.util.Scanner;

/*
    BAEKJOON 10871번 X보다 작은 수
    https://www.acmicpc.net/problem/10871
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    int X = scanner.nextInt();

    ArrayList<Integer> array = new ArrayList<>();

    for(int i = 0; i < N; i++){
      int input = scanner.nextInt();
      if(input < X)
        array.add(input);
    }
    for(int i = 0; i < array.toArray().length; i++){
      System.out.printf("%d ", array.get(i));
    }
    System.out.printf("\n");
  }
}
