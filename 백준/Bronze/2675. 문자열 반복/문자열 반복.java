import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]); // 반복 횟수
            String S = str[1]; // 문자열

            for (byte val : S.getBytes()) {
                for (int n = 0; n < R; n++) {
                    sb.append((char) val);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}