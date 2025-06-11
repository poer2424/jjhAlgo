import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 BAEKJOON 10815번 숫자 카드
 https://www.acmicpc.net/problem/10815
*/

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> owned = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            owned.put(st.nextToken(), 0);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            if(owned.containsKey(st.nextToken())) {
                sb.append("1 ");
            }
            else {
                sb.append("0 ");
            }
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}