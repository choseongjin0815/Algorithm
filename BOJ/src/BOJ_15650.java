import java.util.Scanner;

public class BOJ_15650 {

    private static int N, M;
    private static int[] arr;

    private static void dfs(int at ,int depth) {
        if(depth == M) {
            for(int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for(int i = at; i<=N; i++) {
            arr[depth] = i;
            dfs(i+1, depth+1);
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt(); //depth
        arr = new int[M];
        dfs(1, 0);
    }

}
