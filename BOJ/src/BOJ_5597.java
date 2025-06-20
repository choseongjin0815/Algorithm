import java.util.Scanner;

public class BOJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[30];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = false;
        }
        for(int i = 0; i < 28; i++) {
            int c = sc.nextInt();
            arr[c-1] = true;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == false) {
                System.out.println(i+1);
            }
        }
    }
}
