import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int v = 0;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(st.nextToken());
            v += a * a;
        }
        System.out.println(v % 10);
        br.close();
    }
}