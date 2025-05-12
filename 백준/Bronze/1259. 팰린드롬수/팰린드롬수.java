import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;

            StringBuilder copy = new StringBuilder(s);
            String reverse = copy.reverse().toString();

            if (s.equals(reverse)) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }

        br.close();
        System.out.println(sb);
    }
}