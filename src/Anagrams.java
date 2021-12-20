import java.util.Scanner;

/**
 * Надо вспомнить, что String - это объект.
 * Надо вспомнить, как переопределяется equals и hashcode
 * и зачем вообще переопределяют hashcode
 */

public class Anagrams {
    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if (!a.contains(b.charAt(i)+"") || !b.contains(a.charAt(i)+"")) {
                return false;
            }
        }
        int aInt = 0, bInt = 0;
        for (int i = 0; i < a.length(); i++){
            aInt += a.charAt(i);
            bInt += b.charAt(i);
        }

        return aInt == bInt;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

}
