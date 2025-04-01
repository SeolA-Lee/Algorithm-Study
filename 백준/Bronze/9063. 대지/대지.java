import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr_x = new int[N];
        int[] arr_y = new int[N];
        
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr_x[i] = Integer.parseInt(st.nextToken());
            arr_y[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr_x);
        Arrays.sort(arr_y);
        
        System.out.println((arr_x[N-1] - arr_x[0]) * (arr_y[N-1] - arr_y[0]));
        br.close();
    }
}