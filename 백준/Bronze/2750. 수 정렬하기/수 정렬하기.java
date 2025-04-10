import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int val : arr) {
            sb.append(val).append("\n");
        }
        
        System.out.println(sb);
    }
}