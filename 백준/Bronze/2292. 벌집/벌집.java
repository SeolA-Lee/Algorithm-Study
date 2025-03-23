import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int count = 1;
        int range = 2;
        while (range <= N) {
            if (N == 1) break;
            range = range + (6 * count);
            count++;
        }
        
        System.out.println(count);
        br.close();
    }
                       

}