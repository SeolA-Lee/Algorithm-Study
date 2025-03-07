import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            String s = br.readLine();
            int A = s.charAt(0) - '0';
            int B = s.charAt(2) - '0';
            sb.append("Case #" + i + ": ").append(A + " + " + B + " = " + (A + B)).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}