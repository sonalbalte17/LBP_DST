package HackerRank_1;

import java.util.Scanner;
//Create a function that takes a string, check if it has the same number of x's and o's and returns either true or false.
//1. return boolean value true or false.
//2. returns true if the amount x's and o's are the same.
//3. returns false if they are not the same amount.
//4. the string can contain any character.
//5. when 'x' and 'o' are not in the string, return true.
public class lbp_064 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int xc=0,oc=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='x')
                xc++;
            if (s.charAt(i)=='o')
                oc++;
        }
        System.out.println(xc==oc);
    }
}
