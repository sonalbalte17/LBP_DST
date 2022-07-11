package HackerRank_1;

import java.util.Scanner;

//write a function that shutters a word as if someone is struggling to read it.
// The first two letters are repeated twice with an ellipsis ... , and then the word is pronounced with a question mark?
public class lbp_065 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        System.out.println(s.substring(0,2)+"..."+s.substring(0,2)+"..."+s+'?');
    }
}
