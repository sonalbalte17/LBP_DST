package HackerRank;

import java.util.Scanner;
//Implement the following function int BlackJack(int n1,int n2);
//the function accepts two +ve integers n1 and n2 as its arguments. Implement the function on given two vlaues to return an int value as follows
//return whichever value is nearest to 21 without going over. Return if they go both go over.
public class lbp_040 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        System.out.println(blckjck(n1,n2));
    }

    private static int blckjck(int n1, int n2) {
        if (n1>21&&n2>21)
        return 0;
        else if (n1>21)
            return n2;
        else if (n2>21)
            return n1;
        else
            return Math.max(n1,n2);
    }
}
