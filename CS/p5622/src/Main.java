import java.util.Scanner;

/*
    BAEKJOON 5622번 다이얼
    https://www.acmicpc.net/problem/5622
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.
    String[] dial = new String[]{"null", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "null"};
    String input = scanner.next();
    int sum = 0;

    for(int i = 0; i < input.length(); i++){
      int index = findnumber(dial, input.charAt(i));
      int time = index + 1;
      sum += time;
    }

    System.out.println(sum);

  }

  public static int findnumber(String[] N, char a) {
    for(int i = 0; i < 9; i++){
      for(int j = 0; j < N[i].length(); j++){
        if(a == N[i].charAt(j))
          return i+1;
      }
    }
    return 0;
  }
}
