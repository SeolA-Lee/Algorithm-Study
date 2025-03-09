import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken()); // 반복 횟수
            String S = st.nextToken(); // 문자열

            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                for (int n = 0; n < R; n++) {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}