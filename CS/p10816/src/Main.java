import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 BAEKJOON 10816번 숫자 카드 2
 https://www.acmicpc.net/problem/10816
*/

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> hash = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            String temp = st.nextToken();
            if(hash.containsKey(temp)) {
                int t = hash.get(temp);
                hash.replace(temp, ++t);
            }
            else {
                hash.put(temp, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int  i = 0; i < M ;i++) {
            String tem = st.nextToken();
            if(hash.containsKey(tem)) {
                bw.write(hash.get(tem) + " ");
            }
            else {
                bw.write(0 + " ");
            }
        }

        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}