import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 포켓몬 개수
        int M = Integer.parseInt(st.nextToken()); // 맞춰야 할 문제 수

        HashMap<String, Integer> strMap = new HashMap<>();
        HashMap<Integer, String> numMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String pokemon = br.readLine();
            strMap.put(pokemon, i + 1);
            numMap.put(i + 1, pokemon);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String findPokemon = br.readLine();

            try {
                int key = Integer.parseInt(findPokemon);
                sb.append(numMap.get(key)).append("\n");
            } catch (Exception e) {
                sb.append(strMap.get(findPokemon)).append("\n");
            }
        }
        br.close();

        System.out.println(sb);
    }
}