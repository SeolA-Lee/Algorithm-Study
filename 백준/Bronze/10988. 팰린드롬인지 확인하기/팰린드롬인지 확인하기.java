import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = new StringBuilder(s1).reverse().toString();

        if (s1.equals(s2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        br.close();
    }
}