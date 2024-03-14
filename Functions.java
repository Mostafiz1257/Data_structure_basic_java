import java.util.Scanner;

public class Functions {
    public static int sum(int num1, int num2 ) {
        int totalSum = num1 + num2;
        int mainus = num1-num2;
        System.out.println(totalSum);
        System.out.println(mainus);
        return totalSum;
    }

    public static void main(StringAll args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sum(num1, num2);
    }
} 
