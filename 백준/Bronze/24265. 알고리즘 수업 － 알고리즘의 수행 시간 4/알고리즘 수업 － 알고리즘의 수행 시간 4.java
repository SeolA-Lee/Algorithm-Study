import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(totalSum(n));
        System.out.println(2);
        br.close();
    }

    public static long totalSum(long n) {
        long sum = 0;
        for (long i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}