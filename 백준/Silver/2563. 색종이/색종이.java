import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[100][100];

        StringTokenizer st;
        int area = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for (int j = A; j < A+10; j++) {
                for (int k = B; k < B+10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
        br.close();
    }
}