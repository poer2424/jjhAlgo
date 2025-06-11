import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 BAEKJOON 1920번 수 찾기
 https://www.acmicpc.net/problem/1920
*/

public class Main {

    public static class BinarySearch {
        public BinarySearch(ArrayList<Integer> list, int input) {
            int left = 0;
            int right = list.size() - 1;
            while(left <= right) {
                int mid = left + (right - left) / 2;

                if(list.get(mid) == input) {

                }
            }
        }
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<Integer> arr = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int input = Integer.parseInt(st.nextToken());
            boolean flag = false;

            int left = 0;
            int right = arr.size() - 1;
            while(left <= right) {
                int mid = left + (right - left) / 2;

                if(arr.get(mid) == input) {
                    flag = true;
                    break;
                }
                else if(arr.get(mid) > input) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }

            if(flag) {
                bw.write("1\n");
            }
            else {
                bw.write("0\n");
            }

        }

        bw.flush();
        bw.close();


    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}