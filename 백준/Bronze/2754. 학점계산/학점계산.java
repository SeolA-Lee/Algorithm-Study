import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        Double score = 0.0;

        char a = st.charAt(0);

        if (a == 'F') {
            br.close();
            System.out.println(score);
            return;
        }

        if (a == 'A') {
            score = 4.0;
        } else if (a == 'B') {
            score = 3.0;
        } else if (a == 'C') {
            score = 2.0;
        } else if (a == 'D') {
            score = 1.0;
        }

        char b = st.charAt(1);

        if (b == '+') {
            score += 0.3;
        } else if (b == '-') {
            score -= 0.3;
        }

        System.out.println(score);
        br.close();
    }
}