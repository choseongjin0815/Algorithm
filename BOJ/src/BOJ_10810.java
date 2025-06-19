import java.util.Scanner;

public class BOJ_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int i, j, k = 0;
        int[] arr = new int[N];

        for(int f = 0; f < N; f++) {
            arr[f] = 0;
        }

        for (int f = 0; f < M; f++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for (int s = i - 1; s < j; s++ ) {
                arr[s] = k;
            }
        }

        for (int f = 0; f < N; f++) {
            System.out.print(arr[f] + " ");
        }
    }
}
