import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr_x = new int[N];
        int[] arr_y = new int[N];
        
        StringTokenizer st;
        int area;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            arr_x[i] = x;
            arr_y[i] = y;
        }
        
        if (N == 1) {
            area = 0;
        } else {
            Arrays.sort(arr_x);
            Arrays.sort(arr_y);
            
            area = (arr_x[N-1] - arr_x[0]) * (arr_y[N-1] - arr_y[0]);
        }
        
        System.out.println(area);
        br.close();
    }
}