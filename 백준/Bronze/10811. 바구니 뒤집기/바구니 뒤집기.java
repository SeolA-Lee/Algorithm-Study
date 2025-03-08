import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 역순 횟수
        
        int[] basket = new int[N];
        for (int x = 0; x < N; x++) {
            basket[x] = x + 1;
        }
        
        for (int x = 0; x < M; x++) {
            st = new StringTokenizer(br.readLine(), " ");
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            
            for (int y = I; y <= J; y++) {
                int tmp = basket[y - 1];
                basket[y - 1] = basket[J - 1];
                basket[J - 1] = tmp;
                J--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < N; x++) {
            sb.append(basket[x] + " ");
        }
        System.out.println(sb);        
        br.close();
    }
}