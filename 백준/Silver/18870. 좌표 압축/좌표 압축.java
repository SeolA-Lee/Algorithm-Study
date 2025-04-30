import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            arr1[i] = x;
            arr2[i] = x;
        }

        Arrays.sort(arr2);

        int value = 0;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(arr2[i])) {
                map.put(arr2[i], value);
                value++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(arr1[i])).append(" ");
        }

        System.out.println(sb);
    }
}