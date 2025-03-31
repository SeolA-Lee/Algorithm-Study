import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arr_x = new int[3];
        int[] arr_y = new int[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            arr_x[i] = Integer.parseInt(st.nextToken());
            arr_y[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr_x);
        Arrays.sort(arr_y);

        System.out.println(findXY(arr_x) + " " + findXY(arr_y));
        br.close();
    }

    public static int findXY (int[] arr) {
        if (arr[0] == arr[1]) return arr[2];
        else return arr[0];
    }
}