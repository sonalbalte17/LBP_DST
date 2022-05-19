package HackerRank;
//Program to check whether the given number is palindrome or not
import java.util.Scanner;

public class lbp_017_2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int rev =0;
        int temp=n,d;
        while (n!=0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("Yes");
        }
        else{ System.out.println("No");}
    }
}
