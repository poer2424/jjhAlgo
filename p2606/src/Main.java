import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 BAEKJOON 2606번 바이러스
 https://www.acmicpc.net/problem/2606
*/

public class Main {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int virus;

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        graph = new ArrayList<ArrayList<Integer>>();
        int node = Integer.parseInt(br.readLine());
        visited = new boolean[node+1];
        for(int i = 0; i <= node; i++) {
            graph.add(new ArrayList<Integer>());
        }
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph.get(from).add(to);
            graph.get(to).add(from);

        }

        bfs(1);

        System.out.println(virus);
    }

    static void bfs(int startnode) {
        virus = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startnode);
        visited[startnode] = true;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            for(int nextnode : graph.get(node)) {
                if(!visited[nextnode]) {
                    queue.offer(nextnode);
                    visited[nextnode] = true;
                    virus++;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}