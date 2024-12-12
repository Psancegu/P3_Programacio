import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = "\\d, [0-9], [0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sc.nextLine());
        System.out.println(matcher.matches());
    }
}