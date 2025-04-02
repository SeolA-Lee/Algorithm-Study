import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break; // 종료 조건

            Arrays.sort(arr);
            // 삼각형 조건 : 가장 긴 변의 길이 < 나머지 두 변의 길이의 합
            if (arr[2] >= arr[0] + arr[1]) sb.append("Invalid").append("\n");
            else {
                if (arr[0] == arr[1] && arr[1] == arr[2]) sb.append("Equilateral").append("\n"); 
                else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
                    sb.append("Isosceles").append("\n");
                }
                else if (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]) {
                    sb.append("Scalene").append("\n");
                }
            }
        }
        
        System.out.println(sb);
        br.close();
    }
}