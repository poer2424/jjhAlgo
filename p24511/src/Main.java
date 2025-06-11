import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] typeArr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            typeArr[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {

            int num = Integer.parseInt(st.nextToken());
            if(typeArr[i] == 0){
                deque.addLast(num);
            }
        }

        int M = Integer.parseInt(br.readLine()); // 삽입할 수열의 길이

        st = new StringTokenizer(br.readLine());
        br.close();
        while(M --> 0){
            int moveValue = Integer.parseInt(st.nextToken());
            deque.addFirst(moveValue);
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb);

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
