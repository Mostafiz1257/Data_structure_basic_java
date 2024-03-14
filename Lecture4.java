import java.util.Scanner;

public class Lecture4 {
    public static void main (StringAll args []){
        // for( int i = 0; i<10;i++){
        //     System.out.print(i);
        // }
        int i = 0; 
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        // System.out.println(value);
        int sum = 0;
        
        // while(i<value){
        //     sum = sum+i;
        //     i++;
        //     System.out.println(i);

        //     System.out.println(sum);
        // }
        for( i=1; i<=10;i++){
            // sum = sum+i;
            System.out.println(i*value);
        }

    }
}
