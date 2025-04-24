import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String worker = st.nextToken();
            String log = st.nextToken();
            
            if (log.equals("enter")) {
                set.add(worker);
            } else if (log.equals("leave")) {
                set.remove(worker);
            }
        }
        br.close();
        
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (String key : list) {
            sb.append(key).append("\n");
        }
        
        System.out.println(sb);
    }
}