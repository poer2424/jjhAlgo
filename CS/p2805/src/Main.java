import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Array;
import java.util.*;

/*
 BAEKJOON 2805번 나무 자르기
 https://www.acmicpc.net/problem/2805
*/

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort(Collections.reverseOrder());

        long low = 0;
        long high = list.get(0);
        long mid;
        long answer = 0;
        while(low <= high) {
            mid = low + (high - low) / 2;
            long cuttedWood = 0;
            for(int i = 0; i < N; i++) {
                if (list.get(i) > mid) {
                    cuttedWood += (list.get(i) - mid);
                }
            }
            if(cuttedWood >= M) {
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