package HackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lbp_034 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        Pattern p=Pattern.compile("[a-z]+[_|0-9]@gmail[.]com");
        Matcher m=p.matcher(s);
        System.out.println(m.find()&& m.group().equals(s));
    }
}
