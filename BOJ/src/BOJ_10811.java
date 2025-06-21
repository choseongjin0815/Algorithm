import java.util.Scanner;

public class BOJ_10811 {

    public static int[] arr;

    public static void reverseArray(int i, int j) {
        int r = 0;
//        System.out.println(i + " " +  j);
        for(int k = i; k <= (j+i)/2; k++) {
            r++;
            int temp = arr[k-1];
            arr[k-1] = arr[j-r];
            arr[j-r] = temp;
        }

//        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++) {
//            System.out.println(i);
            arr[i] = (i+1);

        }



        for(int cnt = 0; cnt < m; cnt++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            reverseArray(i, j);
        }

        for(int cnt = 0; cnt < n; cnt++) {
            System.out.print(arr[cnt] + " ");
        }
    }
}
