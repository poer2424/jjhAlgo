import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 BAEKJOON 11866번 요세푸스 문제 0
 https://www.acmicpc.net/problem/11866
*/

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            queue.offer(i+1);
        }

        while(!queue.isEmpty()) {
            for(int i = 0; i < k-1; i++) {
                queue.offer(queue.poll());
            }
            arr.add(queue.poll());
        }

        bw.write("<");

        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                bw.write(arr.get(i) + ">");
            } else {
                bw.write(arr.get(i) + ", ");
            }
        }

        bw.flush();
        bw.close();

    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}