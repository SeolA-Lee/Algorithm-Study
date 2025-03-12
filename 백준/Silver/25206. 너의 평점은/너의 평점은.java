import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        double totalSum = 0.0; // (학점 * 과목평점)의 합
        double totalCredit = 0.0; // 학점의 총합

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double g = 0.0;

            // P가 아닌 경우에만 (학점*과목평점) 더하고, 학점도 더함
            if (!grade.equals("P")) {
                if (grade.charAt(0) == 'A') {
                    g += 4.0;
                } else if (grade.charAt(0) == 'B') {
                    g += 3.0;
                } else if (grade.charAt(0) == 'C') {
                    g += 2.0;
                } else if (grade.charAt(0) == 'D') {
                    g += 1.0;
                } else if (grade.charAt(0) == 'F') {
                    g += 0.0;
                }

                if (grade.length() == 2 && grade.charAt(1) == '+') {
                    g += 0.5;
                }

                totalSum += (credit * g);
                totalCredit += credit;
            }
        }

        System.out.println(totalSum / totalCredit);
        br.close();

    }
}