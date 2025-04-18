import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] students = new int[31];

        for (int i = 1; i <= 30; i++) {
            students[i] = i;
        }

        for (int i = 0; i < 28; i++) {
            st = new StringTokenizer(br.readLine());
            students[Integer.parseInt(st.nextToken())] = 0;
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] != 0) {
                System.out.println(students[i]);
            }
        }
        br.close();
    }
}