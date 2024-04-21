import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaStringRegex{

    /**
     * Using Regex, we can easily match or search for patterns in a text.
     * Before searching for a pattern, we have to specify one using some well-defined syntax.
     * In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
     */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    public String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
}