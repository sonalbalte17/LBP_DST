package HackerRank;
//Program to check whether the given number is palindrome or not.
import java.util.Scanner;

public class lbp_017 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        String s2=sb.toString();
        if (s1.equals(s2))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
    }

