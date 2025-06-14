import java.util.Scanner;

public class BOJ_2720 {
    //쿼터0.25 다임0.1 니켈0.05 페니0.01

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]/25 + " " + (arr[i]%25) / 10 + " " + (arr[i]%25%10)/5 + " " + (arr[i]%25%10%5));
        }



    }
}
