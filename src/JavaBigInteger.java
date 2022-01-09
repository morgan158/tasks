import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BigInteger a = new BigInteger(scanner.nextLine());
//        BigInteger b = new BigInteger(scanner.nextLine());
//        System.out.println(a.add(b));
//        System.out.println(a.multiply(b));

        try {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException e) {
            System.out.println("bad number");
        }
    }
}
