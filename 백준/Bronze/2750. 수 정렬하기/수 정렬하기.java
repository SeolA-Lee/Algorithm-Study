import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        boolean[] arr = new boolean[2001];
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true;
        }
        br.close();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2001; i++) {
            if (arr[i]) {
                sb.append(i - 1000).append("\n");   
            }
        }
        
        System.out.println(sb);
    }
}