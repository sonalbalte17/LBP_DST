package HackerRank;

import java.util.Scanner;

public class lbp_043 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,se=0,so=0,d;
        n=obj.nextInt();
        while(n!=0){
            d=n%10;
            if(d%2==0)
                se=se+d;
            else
                so=so+d;
            n=n/10;
        }
        System.out.println(se*so);
    }
}
