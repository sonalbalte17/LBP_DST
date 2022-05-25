package HackerRank;

import java.util.Scanner;
//An e-commerce website wishes to find the lucky customer who will be eligible for full value cash back. For this purpose,a number N is fed to the system. It will return another number that is calculated by an algorithm. In the algorithm, a sequence is generated, in which each number n the sum of the preceding numbers. initially the sequence will have two 1's in it.
//The System will return the Nth number from the generated sequence which is treated as the order ID. The lucky customer will be one who has placed that order.
//Write an alorithm to help the website find the lucky customer.
public class lbp_20 {
    static int fib(int n){
        if(n==0||n==1)
            return n;
        else
            return fib(n-1)+ fib(n-2);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(fib(n));

    }
}
