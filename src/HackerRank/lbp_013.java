package HackerRank;

import java.util.Scanner;

public class lbp_013 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
