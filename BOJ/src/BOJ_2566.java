import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max;
        int row = 0;
        int col = 0;


        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        max = arr[0][0];

        for (int[] a : arr) {
            for(int num : a) {
                if(max < num) {
                    max = num;
                }
            }
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(arr[i][j] == max) {
                    row = i + 1;
                    col = j + 1;
                }
            }
        }



        System.out.println(max);
        System.out.print(row+" "+col);







    }
}
