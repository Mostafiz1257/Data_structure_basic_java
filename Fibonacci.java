import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculateFibonacci(n));
    }

    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int prev1 = 0;
            int prev2 = 1;
            int fib = 0;

            for (int i = 2; i <= n; i++) {
                fib = prev1 + prev2;
                prev1 = prev2;
                prev2 = fib;
            }
            return fib;
        }
    }
}
