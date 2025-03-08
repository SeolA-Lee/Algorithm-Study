import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 공 넣을 횟수

        int i, j, k;
        int[] basket = new int[N];

        while (M != 0) {
            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken()); // 처음 넣을 바구니
            j = Integer.parseInt(st.nextToken()); // 마지막 넣을 바구니
            k = Integer.parseInt(st.nextToken()); // 공 번호

            for (int t = i; t <= j; t++) {
                basket[t-1] = k;
            }

            M--;
        }

        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < N; a++) {
            sb.append(basket[a]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}