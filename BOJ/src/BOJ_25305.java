import java.util.Arrays;
import java.util.Scanner;

public class BOJ_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
//        System.out.println(arr[0]+" " +arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
        System.out.println(arr[N-K]);
    }
}
