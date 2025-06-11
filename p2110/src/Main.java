import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.*;

/*
 BAEKJOON 2110번 공유기 설치
 https://www.acmicpc.net/problem/2110
*/

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        int low = 1;
        int high = list.get(N - 1) - list.get(0);
        int answer = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int count = 1;
            int prevlocate = list.get(0);
            for(int i = 1; i < list.size(); i++) {
                int locate = list.get(i);
                if(locate - prevlocate >= mid) {
                    count++;
                    prevlocate = locate;
                }
            }
            if(count >= C) {
                answer = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}