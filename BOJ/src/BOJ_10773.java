import java.util.*;

public class BOJ_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            if(a != 0) {
                stack.push(a);
            }else {
                stack.pop();
            }
        }
        for(int a : stack) {
            result += a;
        }

        System.out.print(result);
    }
}
