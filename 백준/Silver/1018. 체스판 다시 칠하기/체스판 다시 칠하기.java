import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /**
         * W = true
         * B = false
         */
        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        
        br.close();
        
        int NRow = N - 7;
        int MRow = M - 7;

        for (int i = 0; i < NRow; i++) {
            for (int j = 0; j < MRow; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    private static void find(int x, int y) {
        
        int endX = x + 8;
        int endY = y + 8;
        int count = 0;
        
        boolean color = arr[x][y]; // 첫 번째 칸의 색
        
        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {
                if (arr[i][j] != color) {
                    count++;
                }

                color = !color;
            }
            
            color = !color;
        }
        
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}