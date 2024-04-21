import java.io.*;
import java.util.*;

public class JavaStringTokens {
    /**
     * Given a string, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
     * We define a token to be one or more consecutive English alphabetic letters.
     * Then, print the number of tokens, followed by each token on a new line.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim()
        
        if (s == null || s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String[] splits = s.split("[\\s!,?._'@]+");
            System.out.println(splits.length);
            for (String ss : splits) {
                System.out.println(ss);
            }
        }
        
        scan.close();
    }
}
