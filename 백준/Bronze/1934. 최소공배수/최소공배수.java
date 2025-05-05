import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            sb.append(a * b / gcd(a, b)).append("\n");
        }
        br.close();
        
        System.out.println(sb);
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int val = a % b;
            
            a = b;
            b = val;
        }
        return a;
    }
}