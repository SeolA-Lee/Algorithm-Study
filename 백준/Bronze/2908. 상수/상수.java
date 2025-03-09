import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();

        int max = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i >= 0; i--) {
            sb.append(A.charAt(i));
            if (Integer.parseInt(String.valueOf(sb)) > max) {
                max = Integer.parseInt(String.valueOf(sb));
            }
        }
        sb = new StringBuilder();
        for (int i = 2; i >= 0; i--) {
            sb.append(B.charAt(i));
            if (Integer.parseInt(String.valueOf(sb)) > max) {
                max = Integer.parseInt(String.valueOf(sb));
            }
        }
        System.out.println(max);
        br.close();
    }
}