package HackerRank_1;
//Given a valid IP address, return a defanged version of that IP address. A defanged IP address replaces every period '.' with "[.]".
import java.util.Scanner;

public class lbp_051 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        System.out.println(s.replace(".","[.]"));
    }
}
