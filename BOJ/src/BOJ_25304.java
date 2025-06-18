import java.util.Scanner;

public class BOJ_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int total = 0;

        int first, second = 0;

        for(int i = 0; i < n; i++) {
            first = sc.nextInt();
            second = sc.nextInt();

            total += first * second;

            if(i == (n-1)) {
                if(total == x) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }

    }
}
