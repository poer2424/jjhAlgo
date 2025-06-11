import java.util.Scanner;

/*
    BAEKJOON 2941번 크로아티아 알파벳
    https://www.acmicpc.net/problem/2941
*/

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    String input = scanner.next();
    int count = 0;

    for(int i = 0; i < input.length(); i++){
      if (i <= input.length() - 2){
        if(input.charAt(i) == 'c' && input.charAt(i+1) == '='){
          i++;
          count++;
          continue;
        }
        else if(input.charAt(i) == 'c' && input.charAt(i+1) == '-'){
          i++;
          count++;
          continue;
        }
        else if(input.charAt(i) == 'd' && input.charAt(i+1) == '-'){
          i++;
          count++;
          continue;
        }
        else if(input.charAt(i) == 'l' && input.charAt(i+1) == 'j'){
          i++;
          count++;
          continue;
        }
        else if(input.charAt(i) == 'n' && input.charAt(i+1) == 'j'){
          i++;
          count++;
          continue;
        }
        else if(input.charAt(i) == 's' && input.charAt(i+1) == '='){
          i++;
          count++;
          continue;
        }
        else if(input.charAt(i) == 'z' && input.charAt(i+1) == '='){
          i++;
          count++;
          continue;
        }
      }
      if(i <= input.length() - 3){
        if(input.charAt(i) == 'd' && input.charAt(i+1) == 'z' && input.charAt(i+2) == '='){
          i = i + 2;
          count++;
          continue;
        }
      }
      count++;
    }

    System.out.println(count);
  }
}
