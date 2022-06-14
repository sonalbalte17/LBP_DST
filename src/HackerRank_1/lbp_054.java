package HackerRank_1;
//Create a function/method that takes a string and return the word count. The string will be a sentence.
import java.util.Scanner;

public class lbp_054 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int c = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ')
            {
                c++;
            }

        } System.out.println("Number of words in the given string are: " +c);
    }
}

