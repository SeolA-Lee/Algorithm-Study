import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(br.readLine()); // 참가자 수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long[] arr = new long[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        long T = Long.parseLong(st.nextToken()); // 티셔츠 묶음 수
        long P = Long.parseLong(st.nextToken()); // 펜 묶음 수

        br.close();

        int t_count = 0;
        for (int i = 0; i < 6; i++) {
            t_count += arr[i] / T;
            if (arr[i] % T > 0) t_count++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(t_count).append("\n");
        sb.append(N / P).append(" ").append(N % P);

        System.out.println(sb);
    }
}