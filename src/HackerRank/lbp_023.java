package HackerRank;

import java.util.Scanner;
//A special two digit number is a number such that when the sum of its digits is added to the product of its digits, the result should be equal to the original two-digit number.
//Implement a program to accept a two digit number and check whether it is a special two digit number or not.
public class lbp_023 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m,d1,d2;
        d1=n%10;
        d2=(n/10)%10;
        m=(d1+d2)+(d1*d2);
        System.out.println((n==m)?"Yes":"No");


    }
}
