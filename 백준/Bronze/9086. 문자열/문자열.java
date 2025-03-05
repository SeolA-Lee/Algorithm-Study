import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String str;
        for (int i = 0; i < t; i++) {
            str = br.readLine();
            int l = str.length();
            if (l == 1) {
                System.out.println(str + str);
            } else {
                System.out.print(str.charAt(0));
                System.out.println(str.charAt(l-1));
            }
        }
        br.close();
    }
}