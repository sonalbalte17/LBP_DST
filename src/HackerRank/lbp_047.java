package HackerRank;
//Create a function that determines whether a number is Oddish or Evenish.
// A number is Oddish if the sum of all of its digits is Odd, and number is Evenish
// if the sum of all of its digits is even, if a number is Oddish return Oddish else return Evenish.
import java.util.Scanner;

public class lbp_047 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0,d;
        while(n!=0){
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        if(sum%2==0)
            System.out.println("Evenish");
        else
            System.out.println("Oddish");
    }
}
