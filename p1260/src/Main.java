import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Array;
import java.util.*;

/*
 BAEKJOON 1260번 DFS와 BFS
 https://www.acmicpc.net/problem/1260
*/

public class Main {

    static boolean[] visited;
    static List<List<Integer>> graph = new ArrayList<>();

    static void dfs(int nodeindex) {
        visited[nodeindex] = true;
        System.out.print(nodeindex + " ");

        for(int neighbor : graph.get(nodeindex)) {
            if(!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    static void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        visited[startNode] = true;

        while(!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");
            for(int neighbor : graph.get(currentNode)) {
                if(!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        for(int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(V);
        System.out.println();

        Arrays.fill(visited, false);
        bfs(V);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}