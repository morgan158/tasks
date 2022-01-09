import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContent {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            String tag = line.substring(line.indexOf("<")+1, line.indexOf(">"));
            Pattern pattern = Pattern.compile("<" + tag +">.+</" + tag + ">");
            Matcher matcher = pattern.matcher(line);
            if(matcher.matches()) {
                System.out.println(line.substring(matcher.start(), matcher.end()));
            }

            testCases--;
        }
    }
}
