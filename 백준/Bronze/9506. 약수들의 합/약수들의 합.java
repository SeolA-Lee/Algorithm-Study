import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            int[] arr = new int[n];
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arr[i] = i;
                    sum += i;
                }
            }

            if (sum == n) {
                sb.append(n + " = 1");
                for (int val : arr) {
                    if (val != 0 && val != 1) {
                        sb.append(" + ").append(val);
                    }
                }
                sb.append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.").append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}