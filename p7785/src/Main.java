import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
 BAEKJOON 7785번 회사에 있는 사람
 https://www.acmicpc.net/problem/7785
*/

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        HashSet<String> workArray = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String key = st.nextToken();
            String value = st.nextToken();

            if(value.equals("enter")){
                workArray.add(key);
            }else if(value.equals("leave")){
                workArray.remove(key);
            }
        }

        br.close();

        ArrayList<String> list = new ArrayList<>(workArray);
        Collections.sort(list);

        for(int i = list.size()-1;  i >= 0; i--){
            bw.write(list.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}