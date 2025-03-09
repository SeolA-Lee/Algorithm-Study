import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = { 1, 1, 2, 2, 2, 8 };
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] -= n;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int val : arr) {
            sb.append(val + " ");
        }
        System.out.println(sb);        
        br.close();
    }
}