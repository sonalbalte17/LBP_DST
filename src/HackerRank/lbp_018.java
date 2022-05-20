package HackerRank;

import java.util.Scanner;

public class lbp_018 {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        String month=obj.nextLine();
        int day=obj.nextInt();
        System.out.println(month.equals("july") && day==5?1:0);
    }
}
