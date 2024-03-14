public class pattern2 {
    public static void main(StringAll args[]) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 11; j++) {
                if(i==1|| j==1 || i==10 || j==11){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
