package HackerRank;

import java.util.Scanner;

public class lbp_019_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int n = obj.nextInt();
        int i = 0;
        int arr[] = new int[10];
        while (n != 0) {
            arr[i] = n % 2;
            i++;
            n = n / 2;
        }
        System.out.println("Binary number is:  ");
        for (i = i - 1; i >= 0; i--) System.out.print(+arr[i]);
    }
}
