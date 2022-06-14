package HackerRank_1;

import java.util.Scanner;

public class lbp_055 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        if(s1.endsWith(s2))
        {
        System.out.println("true");
    }else
            System.out.println("false");
    }
}
