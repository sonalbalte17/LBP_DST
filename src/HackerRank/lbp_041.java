package HackerRank;
//A company wishes to devise an order confirmation procedure. They plan to require an extra confirmation instead
// of simply auto-confirming the order at the time it is placed. for this purpose, the system will generate one time password to be shared
// with the customer. The customer who is placing the order has to enter the OTP to confirm the order.
// The OTP generated for the requested order ID, as the product of the digits in orderID. ** **Write an algorithm to find the OTP for the OrderID.
import java.util.Scanner;

public class lbp_041 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int d, prdct = 1;
        while (n != 0) {
            d = n % 10;
            prdct = prdct * d;
            n = n / 10;

        }
        System.out.println(prdct);
    }
}
