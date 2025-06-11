import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/*
 BAEKJOON 2667번 단지번호붙이기
 https://www.acmicpc.net/problem/2667
*/

public class Main {

    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static ArrayList<Integer> ans;

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            for(int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1 && !visited[i][j])
                    ans.add(bfs(i,j));
            }
        }
        int size = ans.size();
        Collections.sort(ans);
        ans.add(0, size);

        for (Integer an : ans) {
            System.out.println(an);
        }
    }

    public int bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;
        int count = 1;

        Point node = null;
        while (!queue.isEmpty()) {
            node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = node.x + dx[i];
                int nextY = node.y + dy[i];
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n) {
                    if (!visited[nextX][nextY] && arr[nextX][nextY] == 1) {
                        visited[nextX][nextY] = true;
                        queue.offer(new Point(nextX, nextY));
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}