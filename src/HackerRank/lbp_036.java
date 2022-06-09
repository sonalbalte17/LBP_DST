package HackerRank;

import java.util.Scanner;

public class lbp_036 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
            {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
