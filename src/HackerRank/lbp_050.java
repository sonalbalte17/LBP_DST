package HackerRank;

import java.util.Scanner;

//Create a function that sums the total number of digits between two numbers inclusive.
// for example, if the numbers are 19 and 22, then (1+9)+(2+0)+(2+1)+(2+2)=19.
public class lbp_050 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2= obj.nextInt();
     int s=0;
        for (int i = n1; i <=n2 ; i++) {
    s=s+ sumofdigits(i);
            }
        System.out.println(s);
    }

    private static int sumofdigits(int n) {
        int s=0,d;
        while (n!=0){
            d=n%10;
            s=s+d;
            n=n/10;
        }
        return s;
    }
}
