import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A1 = Integer.parseInt(st.nextToken());
        int B1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int A2 = Integer.parseInt(st.nextToken());
        int B2 = Integer.parseInt(st.nextToken());

        int a = A1 * B2 + A2 * B1;
        int b = B1 * B2;
        int n = gcd(a, b);
        
        System.out.println(a / n + " " + b / n);
    }

    public static int gcd(int A, int B) {
        while (B != 0) {
            int val = A % B;

            A = B;
            B = val;
        }
        return A;
    }
}