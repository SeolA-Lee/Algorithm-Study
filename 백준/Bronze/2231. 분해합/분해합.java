import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int N = Integer.parseInt(br.readLine());
        System.out.println(searchMinConstructor(N));
        br.close();
    }
    
    public static int searchMinConstructor(int n) {        
        for (int i = 0; i < n; i++) {
            int con = i;
            int sum = con;
            while (con > 0) {
                sum += con % 10;
                con /= 10;
            }
            
            if (sum == n) {
                return i;
            }
        }
        
        return 0;
    }
}