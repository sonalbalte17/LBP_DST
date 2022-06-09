package HackerRank;

import java.util.Scanner;

//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
public class lbp_045 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        if(n1!=n2)
            System.out.println(n1+n2);
        else
            System.out.println((n1+n2)*2);
    }
}
