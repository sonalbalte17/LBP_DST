package HackerRank;
//You are climbing a staircase. It takes n steps to reach to the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Note: Given n will be a positive integer.
//logic is same as wap for fibonacci series.
import java.util.Scanner;

public class lbp_028 {
    static int fib(int n) {
        if (n == 0 || n == 1)
            return 1;
        else return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(fib(n));
    }
}
