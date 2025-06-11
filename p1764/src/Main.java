import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
 BAEKJOON 1764번 듣보잡
 https://www.acmicpc.net/problem/1764
*/

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> hash = new HashMap<>();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N+M; i++) {
            String input = br.readLine();
            if(hash.containsKey(input)) {
                hash.replace(input, 2);
            }
            else {
                hash.put(input, 1);
            }
        }

        List<String> result = new ArrayList<>();
        for(String key : hash.keySet()) {
            if(hash.get(key) == 2) {
                result.add(key);
            }
        }

        result.sort(String::compareTo);

        // 결과 출력
        bw.write(result.size() + "\n");
        for (String name : result) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}