import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long A = Long.parseLong(br.readLine());
        long B = Long.parseLong(br.readLine());
        long C = Long.parseLong(br.readLine());

        long result = A * B * C;

        int[] arr = new int[10];
        while (result > 0) {
            arr[(int) (result % 10)] += 1;
            result = (long) result / 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int val : arr) {
            sb.append(val).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}