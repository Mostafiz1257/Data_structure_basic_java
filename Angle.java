import java.util.Scanner;

public class Angle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (H >= 0 || H < 12 || M >= 0 || M < 60) {
            double angle = CalculateAngle(H, M);
            System.out.println(String.format("%.7f", angle));
        }
    }

    static double CalculateAngle(int H, int M) {
        double angleH = ((H % 12 + M / 60.0) * 360.0 / 12.0);
        double angleM = (M * 360.0 / 60.0);
        double angle = Math.abs(angleH - angleM);
        return Math.min(angle, 360 - angle);
    }

}
