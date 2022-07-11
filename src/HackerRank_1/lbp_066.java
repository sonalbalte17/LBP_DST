package HackerRank_1;

import java.util.Scanner;

//Create a function/method that takes a string and returns a string in which each character is repeated once.
public class lbp_066 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + "" + s.charAt(i));
        }
    }
}
