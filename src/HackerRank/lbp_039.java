package HackerRank;
//reverse the string using string buffer
import java.util.Scanner;

public class lbp_039 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s= obj.nextLine();
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
