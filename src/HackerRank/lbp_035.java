package HackerRank;

import java.util.Scanner;

public class lbp_035 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        int d;
        while(n!=0){
            d=n%10;
            if(d==4||d==6||d==8||d==9)
                sum=sum+d;
            n=n/10;
        }
        System.out.println(sum);
    }
}
