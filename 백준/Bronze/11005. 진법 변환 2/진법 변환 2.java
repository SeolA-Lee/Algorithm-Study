import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long N = Long.parseLong(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            if (N % B >= 10 && N % B <= 35) {
                sb.append((char) (N % B + 55));
            } else if (N % B >= 0 && N % B <= 9) {
                sb.append(N % B);
            }
            N = N / B;
        }

        sb.reverse();
        System.out.println(sb);
        br.close();
    }
}