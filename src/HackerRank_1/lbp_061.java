package HackerRank_1;

import java.util.Scanner;

public class lbp_061 {


        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            String s = obj.nextLine();
            int x = (int)(s.charAt(0))-96;
            int y = (int)(s.charAt(1));
            if(x%2==y%2)
                System.out.println("false");
            else
                System.out.println("true");
    }
}
