package HackerRank;

import java.util.Scanner;

//Write a program to check whether the given number is prime number or not.
//given number should be a natural no. like (n>1)
// A number is said to prime if it is having only two factors. i.e. 1 and number itself.
public class lbp_029 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2)
                System.out.println("Number is a prime number.");
            else
                System.out.println("Number is not a prime no.");
        } else {
            System.out.println("Number is not natural no.");
        }
    }
}
