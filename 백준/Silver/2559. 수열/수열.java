import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] sum = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        br.close();

        for (int i = 1; i <= N; i++) {
            sum[i] = Integer.parseInt(st.nextToken()) + sum[i - 1];
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = K; i <= N; i++) {
            int val = sum[i] - sum[i - K];
            if (val > max) {
                max = val;
            }
        }

        System.out.println(max);
    }
}