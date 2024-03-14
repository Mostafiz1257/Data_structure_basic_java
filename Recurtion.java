public class Recurtion {

    public static void Rec(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        Rec(num -1);
       
    }

    public static void main(String args[]) {
        int n = 5;
        Rec(n);
    }
}
