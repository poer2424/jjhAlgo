import java.io.*;
import java.util.StringTokenizer;

/*
    BAEKJOON 15552번 빠른 A+B
    https://www.acmicpc.net/problem/15552
*/

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
    StringTokenizer st;
    int A = Integer.parseInt(br.readLine());
    for(int i = 0; i < A; i++){
      st = new StringTokenizer(br.readLine()," ");
      bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
