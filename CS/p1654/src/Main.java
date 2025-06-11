import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.StringTokenizer;

/*
 BAEKJOON 1654번 랜선 자르기
 https://www.acmicpc.net/problem/1654
*/

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> inputArray = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            inputArray.add(Integer.parseInt(br.readLine()));
        }
        inputArray.sort(Collections.reverseOrder());

        long low = 1;
        long high = inputArray.get(0);
        long answer = 0;
        while(low <= high) {
            long mid = (low + high) / 2;
            int result = 0;
            for(int i = 0; i < inputArray.size(); i++) {
                result += (int) (inputArray.get(i) / mid);
            }
            if(result >= K) {
                answer = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();


    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}