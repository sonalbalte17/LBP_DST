package HackerRank;

import java.util.Scanner;
//Write a program to accept a number and check and display whether it is a Niven Number or not.
//Niven Number is that a number which is divisible by its sum of digits.
public class lbp_022 {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int d,sum=0,temp=n;
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println((temp%sum==0)?"Yes":"No");
    }
    }

