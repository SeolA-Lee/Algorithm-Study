import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            // 호텔층수(H), 각층의방수(W), 몇번째손님(N) 입력
            int H = Integer.parseInt(st.nextToken());
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            // 몫 & 나머지로 방 배정
            if (N % H == 0) {
                sb.append((H * 100) + (N / H)).append("\n");
            } else {
                sb.append(((N % H) * 100) + (N / H) + 1).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}