package HackerRank;

import java.util.Scanner;
//Program to find number of occurrences of the given digit in the number n
public class lbp_016 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int key = obj.nextInt();
        int d, c = 0;
        while (n != 0) {
            d = n % 10;
            if (d == key)
                c++;
            n = n / 10;
        }

        System.out.println(c);

    }
}
