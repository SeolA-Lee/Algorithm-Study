import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        ArrayList<Integer> list = new ArrayList<>();
        while (N > 0) {
            list.add(N % 10);
            N /= 10;
        }

        Collections.sort(list);
        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();
        for (int val : list) {
            sb.append(val);
        }

        System.out.println(sb);
    }
}