import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        
        // 조건: f(n0) <= c*g(n0)이고, f(n)의 기울기가 더 커야 함
        if (a1 * n0 + a0 <= c * n0 && c >= a1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        br.close();
    }
}