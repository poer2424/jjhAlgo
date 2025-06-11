import com.sun.jdi.IntegerType;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 BAEKJOON 1620번 나는야 포켓몬 마스터 이다솜
 https://www.acmicpc.net/problem/1620
*/

public class Main {

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> pokemon = new ArrayList<>();
        HashMap<String, Integer> hash = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            String str;
            hash.put(str = br.readLine(), i + 1);
            pokemon.add(str);
        }
        


        for(int i = 0; i < M; i++) {
            String str;
            if(isInteger(str = br.readLine())) {
                bw.write(pokemon.get(Integer.parseInt(str) - 1) + "\n");
            }
            else {
                bw.write(hash.get(str) + "\n");
            }
        }

        bw.flush();
        bw.close();


    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}