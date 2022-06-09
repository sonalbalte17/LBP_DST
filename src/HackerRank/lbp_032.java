package HackerRank;

import java.util.Scanner;

public class lbp_032 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine().toLowerCase();
        int i,c=0;
        for(i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='0'&& s.charAt(i)<='9'))
                continue;
            else
                c++;
        }
        System.out.println(c);
    }
}
