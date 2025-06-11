import java.util.ArrayList;
import java.util.Scanner;

/*
    BAEKJOON 3052번 나머지
    https://www.acmicpc.net/problem/3052
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.
    boolean temp = true;
    ArrayList<Integer> array = new ArrayList<>();
    for(int i = 0; i < 10; i++){
      int input = scanner.nextInt();
      int remainder = input%42;
      for (Integer integer : array) {
        if (remainder == integer) {
          temp = false;
          break;
        }
      }
      if(temp)
        array.add(remainder);
    }
    System.out.println(array.size());
  }
}
