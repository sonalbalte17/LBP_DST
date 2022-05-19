package HackerRank;
//Given an integer x, return x with its digits reversed.

import java.util.Scanner;

public class lbp_014_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
