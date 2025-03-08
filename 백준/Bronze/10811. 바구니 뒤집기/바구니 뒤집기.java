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
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;
            
            while (I < J) {
                int tmp = basket[I];
                basket[I++] = basket[J];
                basket[J--] = tmp;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int value : basket) {
            sb.append(value + " ");
        }
        System.out.println(sb);        
        br.close();
    }
}