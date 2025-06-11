import java.util.Scanner;

/*
    BAEKJOON 25304번 영수증
    https://www.acmicpc.net/problem/25304
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int total = scanner.nextInt();
    int count = scanner.nextInt();
    int sum = 0;
    for(int i=0; i<count; i++){
      int price = scanner.nextInt();
      int product_count = scanner.nextInt();
      sum = sum + price * product_count;
    }

    if(sum == total)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
