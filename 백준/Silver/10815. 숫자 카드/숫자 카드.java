import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[20000001];

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(st.nextToken()) + 10000000] = true;
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (arr[Integer.parseInt(st.nextToken()) + 10000000]) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        br.close();

        System.out.println(sb);
    }
}