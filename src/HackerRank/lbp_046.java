package HackerRank;
//Create a function that tests whether or not an integer is a perfect number.
// A perfect number is a number that can be written as sum of its factors.
// (equal to sum of its proper divisors) excluding the number itself.
import java.util.Scanner;

public class lbp_046 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;
        //   int n2=obj.nextInt();

            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    sum = sum + i;
            }
            System.out.println(sum==n);

    }
}