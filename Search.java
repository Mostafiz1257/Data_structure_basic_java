import java.util.Scanner;

public class Search {
    public static void main(StringAll args[]) {
        int x = 3;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("x found at index" + x);
            }
        }

    }
}
