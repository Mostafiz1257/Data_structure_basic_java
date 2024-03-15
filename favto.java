import java.util.Scanner;

public class favto {
    public static void power(int a) {

        int start = 0;
        int second = 1;
        for (int i = 0; i < a; i++) {
            int next = start + second;
            System.out.print(next + " ");
            start = second;
            second = next;
          
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        power(a);
    }
}
