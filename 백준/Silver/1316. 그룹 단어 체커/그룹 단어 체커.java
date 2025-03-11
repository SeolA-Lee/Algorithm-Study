import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int count = N;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            int prev = 0;
            int[] alphabet = new int[26];
            for (int j = 0; j < s.length(); j++) {
                int now = s.charAt(j);
                
                if (prev != now) {
                    if (alphabet[now - 'a'] == 0) {
                        alphabet[now - 'a']++;
                        prev = now;
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}