import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        int e = 0;
        for (int i = N.length() - 1; i >= 0; i--) {
            if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                result += (int) ((N.charAt(i) - 'A' + 10) * Math.pow(B, e));
            } else if (N.charAt(i) >= '0' && N.charAt(i) <= '9') {
                result += (int) ((N.charAt(i) - '0') * Math.pow(B, e));
            }
            e++;
        }

        System.out.println(result);
        br.close();
    }
}