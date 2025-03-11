import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] list = new int[26];
        for (int i = 0; i < 26; i++) {
            list[i] = 0;
        }

        StringTokenizer st;
        StringBuilder sb;
        int count = N;
        for (int i = 0; i < N; i++) {
            sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            for (int j = 1; j < s.length(); j++) {
                sb.append(s.charAt(0));
                if (s.charAt(j) != s.charAt(j-1)) {
                    if (!sb.toString().contains(String.valueOf(s.charAt(j)))) {
                        sb.append(s.charAt(j));
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