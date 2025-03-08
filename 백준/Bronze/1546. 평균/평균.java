import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 시험 본 과목 수
        double[] score = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(score);

        double M = score[N - 1];
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += score[i]/M * 100;
        }
        System.out.println(sum / N);
        br.close();
    }
}