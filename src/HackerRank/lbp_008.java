package HackerRank;

import java.util.Scanner;

public class lbp_008 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int d,sum=0;
        while(n!=0){
            d=n%10;

            n=n/10;
        }
        System.out.println(sum);
    }
}
