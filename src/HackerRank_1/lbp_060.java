package HackerRank_1;

import java.util.Scanner;

public class lbp_060 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int a[]=new int[256];
        int i,max;
        for(i=0;i<s.length();i++)
            a[(int)s.charAt(i)]++;
        max=0;
        for(i=0;i<256;i++)
        {
            if(a[i]>a[max])
                max=i;
        }
        System.out.println((char)max);
    }
}
