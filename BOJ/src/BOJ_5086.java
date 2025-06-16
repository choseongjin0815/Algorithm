import java.util.Scanner;

public class BOJ_5086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            if(N == 0 && K == 0) break;

            if (N % K == 0) System.out.println("multiple");
            else if (K % N == 0) System.out.println("factor");
            else System.out.println("neither");

        }
    }
}
