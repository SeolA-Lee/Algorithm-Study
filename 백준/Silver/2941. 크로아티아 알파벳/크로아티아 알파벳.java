import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] list = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int check = 0;
        for (int i = 0; i < list.length; i++) {
            check = s.indexOf(list[i]);
            if (check >= 0) {
                s = s.replaceAll(list[i], "A");
            }
        }
        
        System.out.println(s.length());
        br.close();
    }
}