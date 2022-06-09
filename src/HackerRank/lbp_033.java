package HackerRank;

import java.util.Scanner;

public class lbp_033 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        int d;
        while(n!=0){
            d=n%10;
            if(d%2!=0)
                sum=sum+d;
                n=n/10;
                    } System.out.println(sum);
    }
}
