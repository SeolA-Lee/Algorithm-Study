import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append(findPrime(BigInteger.valueOf(Long.parseLong(br.readLine())))).append("\n");
        }
        br.close();

        System.out.println(sb);
    }

    public static BigInteger findPrime(BigInteger num) {
        if (num.isProbablePrime(10)) return num;
        else return num.nextProbablePrime();
    }
}