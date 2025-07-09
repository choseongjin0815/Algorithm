import java.util.Scanner;

public class BOJ_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        String[][] arr = new String[5][15];


        for(int i = 0; i < 5; i++) {
            while(sc.hasNext()) {
                arr[i][j] = sc.next();
                j++;
            }
            j = 0;
        }
    }
}
