import java.util.Scanner;

public class Factorial {

    public static int CalFactorial(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(StringAll args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(CalFactorial( num));
    }

}
