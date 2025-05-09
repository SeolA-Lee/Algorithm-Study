import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        if (A >= B) {
            System.out.println(A * B / gcd(A, B));
        } else {
            System.out.println(A * B / gcd(B, A));
        }
    }

    public static long gcd(long A, long B) {
        while (B != 0) {
            long val = A % B;

            A = B;
            B = val;
        }
        return A;
    }
}