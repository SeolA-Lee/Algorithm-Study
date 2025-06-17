import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] checkArr = new int[4];
    static int[] myArr = new int[4];
    static int check;
    
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
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) check++;
        }

        //
        int result = 0;
        
        for (int i = 0; i < P; i++) add(dna[i]);

        if (check == 4) result++;
        
        // 슬라이딩 윈도우 처리 부분
        for (int i = P; i < S; i++) {
            int j = i - P;
            
            add(dna[i]);
            remove(dna[j]);
            
            if (check == 4) result++;
        }
        
        System.out.println(result);
    }

    private static void add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) check++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) check++;
                break; 
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) check++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) check++;
                break;
        }
    }

    private static void remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) check--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) check--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) check--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) check--;
                myArr[3]--;
                break;
        }
    }
}