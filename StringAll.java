import java.util.*;

public class StringAll {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
       StringBuilder sb = new StringBuilder(name);
       System.out.println(sb);
       sb.insert(2,'K');
              System.out.println(sb);
              sb.delete(2, 03);
              System.out.println(sb);
              sb.append("P");
              System.out.println(sb);

    }
}
