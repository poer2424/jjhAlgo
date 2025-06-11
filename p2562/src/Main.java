import java.util.Scanner;

/*
    BAEKJOON 2562번 최댓값
    https://www.acmicpc.net/problem/2562
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int[] array = new int[9];

    for(int i = 0; i < 9; i++){
      int input = scanner.nextInt();
      array[i] = input;
    }
    int max = array[0];
    int maxindex = 0;
    for(int i = 0; i < 9; i++){
      if(array[i] > max){
        max = array[i];
        maxindex = i;
      }
    }
    System.out.println(max);
    System.out.println(maxindex+1);
  }
}
