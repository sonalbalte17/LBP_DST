package HackerRank_1;
//Given a string s, and an integer array indices of the same length.
// The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string, return shuffled string.
import java.util.Scanner;

public class lbp_053 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int l=s.length();
        System.out.println(l);
        System.out.println(s.substring(s.length()-2,s.length())+s.substring(s.length()-2,s.length())+s.substring(s.length()-2,s.length()));
    }
}
