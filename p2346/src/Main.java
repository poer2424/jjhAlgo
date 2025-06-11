import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {

    public static class Balloon {
        private int index;
        private int value;

        public Balloon(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        Deque<Balloon> deque = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            deque.offerLast(new Balloon(i + 1, Integer.parseInt(inputs[i])));
        }

        Balloon current = deque.pollFirst();
        result.add(current.index);

        while (!deque.isEmpty()) {
            int steps = current.value;

            if (steps > 0) {
                for (int i = 0; i < steps - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }
                current = deque.pollFirst();
            } else {
                for (int i = 0; i < Math.abs(steps) - 1; i++) {
                    deque.offerFirst(deque.pollLast());
                }
                current = deque.pollLast();
            }
            result.add(current.index);
        }

        // 결과 출력
        for (int idx : result) {
            bw.write(idx + " ");
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
