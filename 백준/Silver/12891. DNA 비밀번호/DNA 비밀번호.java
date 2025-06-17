import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] password = new int[4];
    static int[] check = new int[4];
    static int ok;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // DNA 문자열 길이 S, 비밀번호로 사용할 부분문자열 길이 P
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // DNA 문자열
        char[] dna = br.readLine().toCharArray();

        // 부분문자열에 포함되어야 할 A, C, G, T의 최소 개수
        st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < 4; i++) {
            password[i] = Integer.parseInt(st.nextToken());
            if (password[i] == 0) ok++;
        }

        //
        int result = 0;

        for (int i = 0; i < P; i++) slideToAdd(dna[i]);
        if (ok == 4) result++;

        // 슬라이딩 윈도우
        for (int i = P; i < S; i++) {
            int j = i - P;

            slideToAdd(dna[i]);
            slideToRemove(dna[j]);

            if (ok == 4) result++;
        }

        System.out.println(result);
    }

    private static void slideToAdd(char c) {
        switch (c) {
            case 'A':
                check[0]++;
                if (check[0] == password[0]) ok++;
                break;
            case 'C':
                check[1]++;
                if (check[1] == password[1]) ok++;
                break;
            case 'G':
                check[2]++;
                if (check[2] == password[2]) ok++;
                break;
            case 'T':
                check[3]++;
                if (check[3] == password[3]) ok++;
                break;
        }
    }

    private static void slideToRemove(char c) {
        switch (c) {
            case 'A':
                if (check[0] == password[0]) ok--;
                check[0]--;
                break;
            case 'C':
                if (check[1] == password[1]) ok--;
                check[1]--;
                break;
            case 'G':
                if (check[2] == password[2]) ok--;
                check[2]--;
                break;
            case 'T':
                if (check[3] == password[3]) ok--;
                check[3]--;
                break;
        }
    }
}