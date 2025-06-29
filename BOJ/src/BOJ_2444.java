import java.util.Scanner;

public class BOJ_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < 2*n-1; i++) {

            if(i < n-1) {
                for (int j = 0; j < 2 * n - 1; j++) {
                    if (j > (n-1) + i) {}
                    else if (j < (n-1) - i) System.out.print(" ");
                    else System.out.print("*");
                }
            } else if (i > n-1) {
                for (int j = 0; j < 2 * n - 1; j++) {
                    if (j <= i-n) System.out.print(" ");
                    else if (j >= 2*n-1-i+n-1) {}
                    else System.out.print("*");
                }
            }
            else{
                for (int j = 0; j < 2 * n - 1; j++) {
                    System.out.print("*");
                }
            }
            if(i != 2*n-2) {
                System.out.println();
            }
        }
    }
}
