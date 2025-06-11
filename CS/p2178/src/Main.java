import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 BAEKJOON 2178번 미로 탐색
 https://www.acmicpc.net/problem/2178
*/

public class Main {

    static int n, m;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            for(int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0,0);

        System.out.println(arr[n - 1][m - 1]);
    }

    static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,y));
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            Point currentPoint = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nextX = currentPoint.x + dx[i];
                int nextY = currentPoint.y + dy[i];
                if(nextX >= n || nextX < 0 || nextY >= m || nextY < 0)
                    continue;
                if(arr[nextX][nextY] == 0)
                    continue;
                if(visited[nextX][nextY])
                    continue;
                queue.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;
                arr[nextX][nextY] = arr[currentPoint.x][currentPoint.y] + 1;
            }
        }

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}