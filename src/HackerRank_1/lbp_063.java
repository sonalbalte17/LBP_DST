package HackerRank_1;

import java.util.Scanner;

public class lbp_063 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int c=0,i=0;
        for(i=0;i<s.length();i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                c++;
        }
        System.out.println(c);
    }
}
