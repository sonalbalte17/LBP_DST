package HackerRank_1;

import java.util.Scanner;

//Create a function/method that takes a string as its argument and returns the string in reversed order.
public class lbp_057 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        for (int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}
