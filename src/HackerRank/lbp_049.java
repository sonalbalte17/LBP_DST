package HackerRank;
//Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.
import java.util.Scanner;

public class lbp_049 {
    static boolean isprime(int n)
    {
        int f=0,i;
        for (i=1;i<=n;i++)
        {
            if(n%i==0)
                f++;
        }
        return f==2;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n= obj.nextInt();
        while(true){
            if(isprime(n))
            {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
