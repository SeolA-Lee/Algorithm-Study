import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        br.close();

        int crossCount = 1;
        int accumulateSum = 0;

        while (true) {

            if (X <= crossCount + accumulateSum) {
                if (crossCount % 2 == 1) {
                    System.out.println((crossCount - (X - accumulateSum - 1)) + "/" + (X - accumulateSum));
                    break;
                } else {
                    System.out.println((X - accumulateSum) + "/" + (crossCount - (X - accumulateSum - 1)));
                    break;
                }
            } else {
                accumulateSum += crossCount;
                crossCount++;
            }
        }
    }
}