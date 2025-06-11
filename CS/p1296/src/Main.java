import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 BAEKJOON 1296번 팀 이름 정하기
 https://www.acmicpc.net/problem/1296
*/

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> hashmapN = new HashMap<>();
        HashMap<String, Integer> hashmapM = new HashMap<>();

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            hashmapN.put(st.nextToken(), 0);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            hashmapM.put(st.nextToken(), 0);
        }

        int result = 0;

        for(String key : hashmapN.keySet()) {
            if(!hashmapM.containsKey(key)) {
                result++;
            }
        }
        for(String key : hashmapM.keySet()) {
            if(!hashmapN.containsKey(key)) {
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}