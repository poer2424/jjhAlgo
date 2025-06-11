import java.util.Scanner;

/*
    BAEKJOON 2745번 진법 변환
    https://www.acmicpc.net/problem/2745
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    String input = scanner.next();
    int B = scanner.nextInt();
    int sum = 0;
    int k = 0;
    for(int i = input.length()-1; i >= 0; i--){
      if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
        sum += (int) (Math.pow(B, k) * ((int)input.charAt(i) - 55));
        k++;
        continue;
      }
      else{
        sum += (int) (Math.pow(B, k) * ((int)input.charAt(i) - 48));
        k++;
      }
    }

    System.out.println(sum);
  }
}
