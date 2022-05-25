package HackerRank;

import java.util.Scanner;

//Implement a program to find sum of even number between x and y both are inclusive.
//Input Format:two int values
public class lbp_024 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        int sum=0,i;
        for(i=x;i<=y;i++){
            if(i%2==0)
                sum=sum+i;
        }
        System.out.println(sum);
    }
}
