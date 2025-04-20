import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            } else {
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    sb.append("right").append("\n");
                } else if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
                    sb.append("right").append("\n");
                } else if (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) {
                    sb.append("right").append("\n");
                } else {
                    sb.append("wrong").append("\n");
                }
            }
        }
        br.close();

        System.out.println(sb);
    }
}