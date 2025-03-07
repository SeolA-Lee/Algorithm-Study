import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String A = st.nextToken();
            String B = st.nextToken();
            int C = Integer.parseInt(A) + Integer.parseInt(B);
            
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + C);
        }
        br.close();
    }
}