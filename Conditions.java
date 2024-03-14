import java.util.Scanner;

public class Conditions {
    public static void main(StringAll args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // if (number < 18) {
        //     System.out.println("Not adult");
        // } else { 
        //     System.out.println("Adult");
        // }
        switch(number){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Gello");
            break ;
            case  3: System.out.println("mello");
            break;
            default : System.out.println("Invallied");
        }
        sc.close();
    }
}