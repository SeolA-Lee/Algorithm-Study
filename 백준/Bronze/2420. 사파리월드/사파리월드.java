import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // seunghwan.royal.gov.sw 유명도
        long M = sc.nextLong(); // kyuhyun.royal.gov.sw 유명도

        System.out.println(Math.abs(N - M));
    }
}