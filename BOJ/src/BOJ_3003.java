import java.util.Scanner;

public class BOJ_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int[] chess = new int[] {1,1,2,2,2,8};
        for(int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 6; i++) {
            System.out.print(chess[i] - arr[i] + " ");
        }
    }
}
