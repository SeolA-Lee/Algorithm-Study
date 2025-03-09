import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();
        
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int c = s.charAt(i) - '0';
            sum += c;
        }
        System.out.println(sum);
    }
}