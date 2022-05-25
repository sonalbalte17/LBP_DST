package HackerRank;

import java.util.Scanner;

//An e-commerce company plans to give their customers a special discount for the Christmas, they are planning to offer a flat discount. The discount value is calculated as the sum of all prime digits in the total bill amount.
//Write an algorithm to find the discount value for the given total bill amount.
public class lbp_21 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int d,sum=0;
        while(n!=0)
        {
            d=n%10;
            if(d==2||d==3||d==5||d==7)
                sum=sum+d;
            n=n/10;
        }
        System.out.println(sum);
    }
}
