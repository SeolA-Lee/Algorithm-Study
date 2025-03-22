import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 규칙 : (2 * 2^(n-1) + 1)^2
        System.out.println((int) Math.pow((2 * Math.pow(2, N-1) + 1), 2));
        br.close();        
    }
}