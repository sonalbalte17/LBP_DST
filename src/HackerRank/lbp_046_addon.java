package HackerRank;

import java.util.Scanner;

//Program to read date, month and year from the user and check whether it is magic date or not.
//Here are the rules for magic date.
//
//1) mm*dd is a 1-digit number that matches the last digit in YYYY
//2) mm*dd is a 2-digit number that matches the last two digits in YYYY
//3) mm*dd is a 3-digit number that matches the last three digits in YYYY
public class lbp_046_addon {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String[] s=obj.nextLine().split("-");//s[0],s[1],s[2] split by("-")
        System.out.println(s[2].endsWith(Integer.toString(Integer.parseInt(s[0])*Integer.parseInt(s[1]))));
    }
}
