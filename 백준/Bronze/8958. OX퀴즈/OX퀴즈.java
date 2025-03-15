import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int count = 0;
            int sum = 0;
            
            for (byte val : br.readLine().getBytes()) {
                if (val == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }    
            sb.append(sum).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}