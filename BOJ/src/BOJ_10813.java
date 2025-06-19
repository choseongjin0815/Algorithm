import java.util.Scanner;

public class BOJ_10813 {

    public static int arr[];

    public static void swap(int temp1, int temp2) {
        int temp = arr[temp1];
        arr[temp1] = arr[temp2];
        arr[temp2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[N];

        for(int f = 0; f < N; f++) {
            arr[f] = (f+1);
        }

        int temp1;
        int temp2;


        for(int i = 0; i < M; i++) {
            temp1 = sc.nextInt();
            temp2 = sc.nextInt();
            swap(temp1 - 1, temp2 - 1);
        }

        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
