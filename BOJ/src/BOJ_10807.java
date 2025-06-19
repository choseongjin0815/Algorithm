import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr= new int[N];
        int count = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int V = sc.nextInt();

        for(int i = 0; i < N; i++) {
            if(arr[i] == V) {
                count++;
            }
        }

        System.out.println(count);


    }
}
