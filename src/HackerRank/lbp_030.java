package HackerRank;

import java.util.Scanner;

public class lbp_030 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        StringBuffer s2=new StringBuffer(s1);
        System.out.println(s2.reverse().toString());
        System.out.println((s1.equals(s2))?"valid":"invalid");
    }
}
