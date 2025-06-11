import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/*
    BAEKJOON 1157번 단어 공부
    https://www.acmicpc.net/problem/1157
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.
    String input = scanner.next();

    int[] array = new int[26];

    for(int j = 0; j < input.length(); j++){
      array[(int)Character.toLowerCase(input.charAt(j)) - 97]++;
    }

    int max = 0;
    int count = 0;
    int maxindex = 0;

    for(int i = 0; i < 26; i++){
      if(array[i] > max){
        max = array[i];
        maxindex = i;
      }
    }

    for(int i = 0; i < 26; i++){
      if(array[i] == max)
        count++;
    }

    if(count >= 2){
      System.out.println("?");
      return;
    }
    if(count == 1){
      System.out.println((char)(maxindex + 65));
    }

  }
}
