package HackerRank;

import java.util.Scanner;

public class lbp_004 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int sc=obj.nextInt();
        if (sc>=30 && sc<=100)
            if(sc>=30 && sc<=50)
                System.out.println("D");
            else if(sc>=51 && sc<=60)
                System.out.println("C");
            else if(sc>=61 && sc<=80)
                System.out.println("B");
            else
                System.out.println("A");
    }
}
