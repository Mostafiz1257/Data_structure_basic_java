public class Pattern5 {
    public  static void main (StringAll args[]){
        int num =1;
        for(int i= 1; i<=5; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}