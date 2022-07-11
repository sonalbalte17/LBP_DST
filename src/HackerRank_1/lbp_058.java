package HackerRank_1;

import java.util.Locale;
import java.util.Scanner;



//A word has been split into a left part and right part.
// Re-form the word by adding both halves together changing the first character to an upper case letter.
public class lbp_058 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();

        System.out.println(s1.substring(0,1).toUpperCase(Locale.ROOT)+s1.substring(1)+s2);

}}
