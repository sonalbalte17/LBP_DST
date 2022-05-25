package HackerRank;

import java.util.Scanner;
//Program to convert fahrenheit to celsius.
public class lbp_026 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        int Fahrenheit=obj.nextInt();
        int Celsius;
        Celsius=((Fahrenheit-32)*5)/9;

        System.out.println(Celsius);
    }
}
