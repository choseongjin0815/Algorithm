import java.util.Scanner;

public class BOJ_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n/4; i++) {
            System.out.print("long ");
            if(i == (n/4-1)) {
                System.out.print("int");
            }
        }
    }
}
