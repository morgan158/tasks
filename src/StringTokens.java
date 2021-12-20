import java.util.*;

public class StringTokens {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() > 0) {
            String[] arr = s.split("[ !,?._'@]+");
            System.out.println(arr.length);
            for (String value : arr) {
                System.out.println(value);
            }
        } else {
            System.out.println(0);
        }
        scan.close();
    }

}