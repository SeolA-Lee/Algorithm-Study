import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(sum / 5).append("\n");

        Arrays.sort(arr);
        sb.append(arr[2]);

        System.out.println(sb);
    }
}