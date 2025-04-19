import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 나이 범위 : 1 ~ 200
        StringBuilder[] sb_arr = new StringBuilder[201];
        
        // 객체 배열의 인덱스에 각 StringBuilder 객체를 생성함
        for (int i = 0; i < sb_arr.length; i++) {
            sb_arr[i] = new StringBuilder();
        }
        
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            sb_arr[age].append(age + " " + name).append("\n");
        }
        br.close();
        
        StringBuilder sb = new StringBuilder();
        for (StringBuilder val : sb_arr) {
            sb.append(val);
        }
        
        System.out.println(sb);
    }
}