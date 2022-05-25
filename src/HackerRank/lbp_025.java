package HackerRank;

import java.util.Scanner;

//Create a function/method to convert celsius to fahrenheit
public class lbp_025 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int Celsius=obj.nextInt();
        int Fahrenheit;

        Fahrenheit=((Celsius*9)/5)+32;
        System.out.println(Fahrenheit);
    }
}
