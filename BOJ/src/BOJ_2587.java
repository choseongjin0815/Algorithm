import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int res = 0;

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            res += arr[i];
            if(i == 4) {
                System.out.println(res/5);
                Arrays.sort(arr);
                System.out.println(arr[2]);
            }
        }
    }
}
