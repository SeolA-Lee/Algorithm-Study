import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            sb.append(changes(C, 25)).append(" ");
            C -= 25 * changes(C, 25);
            sb.append(changes(C, 10)).append(" ");
            C -= 10 * changes(C, 10);
            sb.append(changes(C, 5)).append(" ");
            C -= 5 * changes(C, 5);
            sb.append(changes(C, 1)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    public static int changes(int c, int d) {
        int n = 0;
        while (c >= d) {
            c -= d;
            n++;
        }
        return n;
    }
}