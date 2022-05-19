//Program to read a number and check whether it is duck number or not.
//Hint: A duck number is a number which has zeros present in it, but no zero present in the begining of the number.
package HackerRank;

import java.util.Scanner;

public class lbp_015 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int c = 0;
        while (n != 0) {
            int d = n % 10;
            if (d == 0) {
                c++;
            }
            n = n / 10;
        }
        if (c > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
