package HackerRank_1;
//Create a function/method that accepts a string (of person’s first and last name)
// and returns a string with in first and last name swapped).
import java.util.Scanner;

public class lbp_056 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        System.out.print(s1.replace(s1,s2)+" "+s2.replace(s2,s1));

    }
}
