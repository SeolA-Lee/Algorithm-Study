import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);
        
        if (arr[2] < arr[0] + arr[1]) {
            System.out.println(arr[0] + arr[1] + arr[2]);
        } else {
            System.out.println(2 * (arr[0] + arr[1]) - 1);
        }
        
        br.close();
    }
}