package HackerRank;

import java.util.Scanner;

public class lbp_042 {
    static boolean isprime(int n){
        int f=0,i;
        for(i=1;i<=n;i++){
            if(n%i==0)
                f++;
        }
        return f==2;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int sum=0;
        for(int i=n1;i<=n2;i++){
            if (isprime(i))

                sum=sum+i;


        } System.out.println(sum);
    }
}
