import java.util.Scanner;

public class BOJ_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] str = new String[T];
        for(int i = 0; i < T; i++) {
            str[i] = sc.next();
        }

        for (int i = 0; i < T; i++) {
            System.out.println(str[i].charAt(0)+""+str[i].charAt(str[i].length()-1));
        }
    }
}
