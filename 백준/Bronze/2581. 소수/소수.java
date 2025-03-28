import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (Integer i : list) {
                sum += i;
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        }

        br.close();
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}