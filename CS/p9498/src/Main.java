import java.util.Scanner;

/*
    BAEKJOON 9498번 시험 성적
    https://www.acmicpc.net/problem/9498
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int A = scanner.nextInt();

    if(A >= 90 && A <=100){
      System.out.println('A');
    }
    if(A >= 80 && A <90){
      System.out.println('B');
    }
    if(A >= 70 && A <80){
      System.out.println('C');
    }
    if(A >= 60 && A <70){
      System.out.println('D');
    }
    if(A < 60) {
      System.out.println('F');
    }
  }
}
