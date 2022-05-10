package HackerRank;

import java.util.Scanner;

public class lbp_006 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //  System.out.println("Enter n  :");
        int n = obj.nextInt();
        int c = 0;
        if (n >= 0) {
            // c = n / 6;
            //  System.out.println(c);
           int freenos = n + (n / 6);
            System.out.println(freenos);
        }
    }
}
